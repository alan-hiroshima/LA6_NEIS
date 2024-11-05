package KeyEventAct;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyEventActivity extends JFrame{
    private JTextArea editableTextArea;
    private JTextArea nonEditableTextArea;
    private JPanel pMain;

    KeyEventActivity(){
        editableTextArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {

                String inputText = editableTextArea.getText();
                StringBuilder convertedText = new StringBuilder();


                for (char c : inputText.toCharArray()) {

                    if ("aeiouAEIOU".indexOf(c) != -1) {
                        convertedText.append(Character.toUpperCase(c));
                    } else {
                        convertedText.append(c);
                    }
                }

                nonEditableTextArea.setText(convertedText.toString());
            }
        });
    }
    public static void main(String[] args) {
        KeyEventActivity key = new KeyEventActivity();
        key.setTitle("Simple Calculator");
        key.setContentPane(key.pMain);
        key.setSize(450, 300);
        key.setDefaultCloseOperation(EXIT_ON_CLOSE);
        key.setVisible(true);
    }
}
