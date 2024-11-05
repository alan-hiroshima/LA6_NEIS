package FoodOrdering;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrder extends JFrame{


    private JPanel pFoodOrder;
    private JButton btnOrder;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JCheckBox[] foodGroup = {cPizza, cBurger, cFries, cSoftDrinks, cTea, cSundae};
    private int[] prices = {100, 80,65,55,50,40};
    private JRadioButton[] discountGroup = {rbNone, rb5, rb10, rb15};
    private double[] value = {0.0, .05, .1,.15};

    FoodOrder(){
        btnOrder.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                double totalPrice = 0;

                for(int i = 0; i < 6; i++){
                    if(foodGroup[i].isSelected()){
                        totalPrice += prices[i];
                    }
                }

                if(rbNone.isSelected()){
                    String formattedPrice = String.format("%.2f", totalPrice);
                    JOptionPane.showMessageDialog(null, "The total price is Php" + formattedPrice);
                }else{
                    for(int i = 0; i < 4; i++){
                        if(discountGroup[i].isSelected()){
                            double d = totalPrice * value[i];
                            totalPrice -= d;
                            String formattedPrice = String.format("%.2f", totalPrice);
                            JOptionPane.showMessageDialog(null, "The total price is Php" + formattedPrice);
                            break;
                        }
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        FoodOrder food = new FoodOrder();
        food.setTitle("Food Ordering System");
        food.setContentPane(food.pFoodOrder);
        food.setSize(400, 300);
        food.setDefaultCloseOperation(EXIT_ON_CLOSE);
        food.setVisible(true);
    }
}
