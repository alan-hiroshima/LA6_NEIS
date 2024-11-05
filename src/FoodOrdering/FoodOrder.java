package FoodOrdering;

import javax.swing.*;

public class FoodOrder extends JFrame{
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
    private JPanel iyhb;


    FoodOrder(){

    }
    public static void main(String[] args) {
        FoodOrder food = new FoodOrder();
        food.setTitle("Leap Year Checker");
        food.setContentPane(food.iyhb);
        food.setSize(300, 200);
        food.setDefaultCloseOperation(EXIT_ON_CLOSE);
        food.setVisible(true);
    }
}
