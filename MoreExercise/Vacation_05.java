package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class Vacation_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String location = "";
        String destination = "";
        double price = 0.0;

        if (budget <= 1000) {
            location = "Camp";
            if (season.equals("Summer")) {
                destination = "Alaska";
                price = budget - budget * 0.35;
            } else if (season.equals("Winter")) {
                destination = "Morocco";
                price = budget - budget * 0.55;
            }
        }
        else if (budget <= 3000) {
            location = "Hut";
            if (season.equals("Summer")) {
                destination = "Alaska";
                price = budget - budget * 0.20;
            } else if (season.equals("Winter")) {
                destination = "Morocco";
                price = budget - budget * 0.40;
            }
        }
        else {
            location = "Hotel";
            if (season.equals("Summer")) {
                destination = "Alaska";
                price = budget - budget * 0.10;
            } else if (season.equals("Winter")) {
                destination = "Morocco";
                price = budget - budget * 0.10;
            }
        }
        System.out.printf("%s - %s - %.2f", destination, location, price);
    }
}
