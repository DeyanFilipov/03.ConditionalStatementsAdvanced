package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double income = Double.parseDouble(scanner.nextLine());

        boolean isValidData = true;
        double result = 0;
        if (city.equals("Sofia")) {
            if (income >= 0 && income <= 500) {
                result = income * 0.05;

            } else if (income > 500 && income <= 1000) {
                result = income * 0.07;

            } else if (income > 1000 && income <= 10000) {
                result = income * 0.08;

            } else if (income > 10000) {
                result = income * 0.12;

            } else {
                isValidData = false;
            }

        } else if (city.equals("Varna")) {
            if (income >= 0 && income <= 500) {
                result = income * 0.045;

            } else if (income > 500 && income <= 1000) {
                result = income * 0.075;

            } else if (income > 1000 && income <= 10000) {
                result = income * 0.10;

            } else if (income > 10000) {
                result = income * 0.13;

            } else {
                isValidData = false;
            }

        } else if (city.equals("Plovdiv")) {
            if (income >= 0 && income <= 500) {
                result = income * 0.055;

            } else if (income > 500 && income <= 1000) {
                result = income * 0.08;

            } else if (income > 1000 && income <= 10000) {
                result = income * 0.12;

            } else if (income > 10000) {
                result = income * 0.145;

            } else {
                isValidData = false;
            }
        } else {
            isValidData = false;

        }
        if (!isValidData) {
            System.out.println("error");

        } else {
            System.out.printf("%.2f", result);
        }
    }
}