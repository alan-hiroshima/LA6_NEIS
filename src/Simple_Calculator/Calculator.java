package Simple_Calculator;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JTextField tfNumber2;
    private JButton btnCompute;
    private JPanel pCalc;
    private JLabel lblResult;

    Calculator(){
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int first = Integer.parseInt(tfNumber1.getText().trim());
                int second = Integer.parseInt(tfNumber2.getText().trim());
                int result = 0;

                if(cbOperations.getSelectedIndex() == 0){
                    result = first + second;
                } else if (cbOperations.getSelectedIndex() == 1) {
                    result = first - second;
                }
                else if (cbOperations.getSelectedIndex() == 2) {
                    result = first * second;
                }
                else if (cbOperations.getSelectedIndex() == 3) {
                    result = first / second;
                }else{
                    result = 0;
                }

                lblResult.setText(String.valueOf(result));
            }
        });
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setTitle("Simple Calculator");
        calc.setContentPane(calc.pCalc);
        calc.setSize(800, 300);
        calc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        calc.setVisible(true);
    }

}
