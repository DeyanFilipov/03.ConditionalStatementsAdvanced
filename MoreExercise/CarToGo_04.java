package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class CarToGo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (budget <= 100) {
            System.out.println("Economy class");
            if (season.equals("Summer")) {
                System.out.printf("Cabrio - %.2f%n", budget * 35 / 100);
            } else if (season.equals("Winter")) {
                System.out.printf("Jeep - %.2f%n", budget * 65 / 100);
            }
    } else if (budget <= 500) {
            System.out.println("Compact class");
            if (season.equals("Summer")) {
                System.out.printf("Cabrio - %.2f%n", budget  * 45 / 100);
            } else if (season.equals("Winter")) {
                System.out.printf("Jeep - %.2f%n", budget * 80 / 100);
            }
        }else if (budget > 500) {
                System.out.println("Luxury class");
                System.out.printf("Jeep - %.2f%n", budget * 90 / 100);
            }
    }
}