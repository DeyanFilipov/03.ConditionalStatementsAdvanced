package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class SchoolCamp_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double price = 0;
        String sport = "";
        switch (season) {
            case "Winter":
                switch (group) {
                    case "girls":
                        price = nights * students * 9.60;
                        sport = "Gymnastics";
                        break;
                    case "boys":
                        price = nights * students * 9.60;
                        sport = "Judo";
                        break;
                    case "mixed":
                        price = nights * students * 10;
                        sport = "Ski";
                        break;
                }
                break;
            case "Spring":
                switch (group) {
                    case "girls":
                        price = nights * students * 7.20;
                        sport = "Athletics";
                        break;
                    case "boys":
                        price = nights * students * 7.20;
                        sport = "Tennis";
                        break;
                    case "mixed":
                        price = nights * students * 9.50;
                        sport = "Cycling";
                        break;
                }
                break;
            case "Summer":
                switch (group) {
                    case "girls":
                        price = nights * students * 15;
                        sport = "Volleyball";
                        break;
                    case "boys":
                        price = nights * students * 15;
                        sport = "Football";
                        break;
                    case "mixed":
                        price = nights * students * 20;
                        sport = "Swimming";
                        break;
                }
                break;
            default:
                break;
        }
        if (students >= 50) {
            price *= 0.5;
        } else if (students >= 20 && students < 50) {
            price *= 0.85;
        } else if (students >= 10 && students < 20) {
            price *= 0.95;
        }
        System.out.printf("%s %.2f lv.", sport, price);
    }
}
