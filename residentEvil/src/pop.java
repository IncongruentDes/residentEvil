import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.BorderLayout;

public class pop {
	static String name;
 	static ArrayList<achievement> re2;
 	static ArrayList<achievement> re3;
 	static ArrayList<achievement> re4;
	
	
    pop(String Name, ArrayList<achievement> re2r, ArrayList<achievement> re3r, ArrayList<achievement> re4r) {
    	name = Name;
    	re2 = re2r;
    	re3 = re3r;
    	re4 = re4r;
    	
    	
    	
    	pickItem();

    }
    
    public static void pickItem() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JRadioButton radioButton2 = new JRadioButton("re2");
        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(2);
            }
        });

        JRadioButton radioButton3 = new JRadioButton("re3");
        radioButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(3);
            }
        });

        JRadioButton radioButton4 = new JRadioButton("re4");
        radioButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(4);
            }
        });

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        buttonGroup.add(radioButton4);

        panel.add(radioButton2);
        panel.add(radioButton3);
        panel.add(radioButton4);

        int result = JOptionPane.showConfirmDialog(null, panel, "Please select a game",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            if (radioButton2.isSelected()) {
                String str = stringMaker(re2);
            	message(name, re2);
            } else if (radioButton3.isSelected()) {
                String str = stringMaker(re3);
            	message(name, re3);
            } else if (radioButton4.isSelected()) {
                String str = stringMaker(re4);
            	message(name, re4);
            } else {
                System.out.println("No option selected");
            }
        }
    }

    public static void message(String name, ArrayList<achievement> arr) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        for (int i = 0; i < arr.size(); i++) {
            JPanel linePanel = new JPanel(new BorderLayout(0, 0));
            JCheckBox checkBox = new JCheckBox();
            achievement achievement = arr.get(i);
            if (achievement.status) {
                checkBox.setSelected(true);
            }
            checkBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    boolean checked = checkBox.isSelected();
                    achievement.toggleBool(checked);
                }
            });
            linePanel.add(checkBox, BorderLayout.LINE_START);
            JLabel label = new JLabel(arr.get(i).toString());
            label.setFont(new Font("Serif", Font.PLAIN, 14));
            linePanel.add(label, BorderLayout.CENTER);
            panel.add(linePanel);
        }
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (achievement achievement : arr) {
                    System.out.println(achievement.name + ": " + achievement.status);
                }
            }
        });
        panel.add(submitButton);
        JOptionPane.showMessageDialog(null, panel, name, JOptionPane.PLAIN_MESSAGE);
    }



    public static String stringMaker(ArrayList<?> arrayList) {
        StringBuilder strBuilder = new StringBuilder();
        for (int x = 0; x < arrayList.size(); x++) {
            strBuilder.append(arrayList.get(x)).append("\n");
        }
        return strBuilder.toString();
    }
    


}
