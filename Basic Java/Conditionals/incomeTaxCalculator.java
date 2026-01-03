package Conditionals;

public class incomeTaxCalculator {
    public static void main(String[] args) {
        // Problem: Calculate total amout to pay including tax for conditions:
        // if income < 5L -> no tax
        // if income > 5L and income < 10L -> 20% tax
        // if income > 10L -> 30% tax

        int income = 800000;
        if (income <= 499999) {
            System.out.println("no tax");
        } else if (income >= 500000 && income < 999999) {
            float gst = income * 0.2f;
            System.out.println("total gst: " + gst);
            float total_amount = gst + income;
            System.out.println("you have to pay a total: " + total_amount);
        } else {
            float gst = income * 0.3f;
            System.out.println("total gst: " + gst);
            float total_amount = gst + income;
            System.out.println("you have to pay a total: " + total_amount);
        }
    }
}
