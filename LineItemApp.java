package basic.LearnJava;

import java.util.Scanner;

public class LineItemApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Line Item Calculation");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            String productCode = Validator.getString(sc, "Enter product code");
            int quantity = Validator.getInt(sc, "Enter quantity: ", 0, 1000);
        }
    }
}
