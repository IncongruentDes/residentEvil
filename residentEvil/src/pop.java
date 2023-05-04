import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.BorderLayout;

public class pop {
    pop(String name, ArrayList<achievement> arr) {
        String str = stringMaker(arr);
        message(name, arr);
    }

    public static void message(String name, ArrayList<achievement> arr) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        for (int i = 0; i < arr.size(); i++) {
            JPanel linePanel = new JPanel(new BorderLayout(0, 0));
            JCheckBox checkBox = new JCheckBox();
            achievement achievement = arr.get(i);
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
