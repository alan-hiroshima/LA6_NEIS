package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class leapYear extends JFrame{


    private JTextField yearTextField;
    private JPanel pLeap;
    private JButton checkYearButton;

    leapYear(){
        checkYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = Integer.parseInt(yearTextField.getText().trim());

                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    JOptionPane.showMessageDialog(null, "Leap year");
                }else{
                    JOptionPane.showMessageDialog(null, "Not a leap year");
                }
            }
        });
    }

    public static void main(String[] args) {
        leapYear leap = new leapYear();
        leap.setTitle("Leap Year Checker");
        leap.setContentPane(leap.pLeap);
        leap.setSize(300, 200);
        leap.setDefaultCloseOperation(EXIT_ON_CLOSE);
        leap.setVisible(true);
    }
}
