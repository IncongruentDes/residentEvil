import java.util.ArrayList;
import javax.swing.*;

public class pop {
    pop(String name, ArrayList<achievement> arr) {
        String str = stringMaker(arr);
        message(name, str);
    }

    public static void message(String name, String str) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // set the layout to a vertical BoxLayout
        String[] lines = str.split("\n");
        for (int i = 0; i < lines.length; i++) {
            JPanel linePanel = new JPanel(); // create a new panel for each line
            JCheckBox checkBox = new JCheckBox(); // create a checkbox for each line
            linePanel.add(checkBox);
            linePanel.add(new JLabel(lines[i])); // add the label to the same panel as the checkbox
            panel.add(linePanel); // add the panel with the checkbox and label to the main panel
        }
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
