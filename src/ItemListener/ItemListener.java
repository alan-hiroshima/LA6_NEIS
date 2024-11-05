package ItemListener;

import javax.swing.*;

public class ItemListener extends JFrame {

    private JCheckBox cCheckBox;
    private JComboBox comboBox1;
    private JCheckBox cppCheckBox;
    private JCheckBox cSharpCheckBox;
    private JCheckBox javaCheckBox;
    private JCheckBox pythonCheckBox;
    private JLabel proficiencyLabel;
    private JLabel languageLabel;
    private JPanel pItem;

    ItemListener(){

    }

    public static void main(String[] args) {
        ItemListener item = new ItemListener();
        item.setTitle("Simple Calculator");
        item.setContentPane(item.pItem);
        item.setSize(500, 450);
        item.setDefaultCloseOperation(EXIT_ON_CLOSE);
        item.setVisible(true);
    }
}
