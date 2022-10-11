package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class Flowers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfChrysanthemum = Integer.parseInt(scanner.nextLine());
        int countOfRoses = Integer.parseInt(scanner.nextLine());
        int countOfTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String day = scanner.nextLine();

        int totalFlowers = countOfChrysanthemum + countOfRoses + countOfTulips;

        double chrysanthemumPrice = 0.0;
        double rosesPrice = 0.0;
        double tulipsPrice = 0.0;

        if (season.equals("Spring") || season.equals("Summer")) {
            chrysanthemumPrice = countOfChrysanthemum * 2.00;
            rosesPrice = countOfRoses * 4.10;
            tulipsPrice = countOfTulips * 2.5;
        } else if (season.equals("Autumn") || season.equals("Winter")) {
            chrysanthemumPrice = countOfChrysanthemum * 3.75;
            rosesPrice = countOfRoses * 4.50;
            tulipsPrice = countOfTulips * 4.15;
        }
        double totalSum = chrysanthemumPrice + rosesPrice + tulipsPrice;

        if (day.equals("Y")) {
            totalSum *= 1.15;
        }
        if (season.equals("Spring") && (countOfTulips >= 7)) {
            totalSum *= 0.95;
        }
        if (season.equals("Winter") && (countOfRoses >= 10)) {
            totalSum *= 0.9;
        }
        if (totalFlowers >= 20) {
            totalSum *= 0.8;
        }
        System.out.printf("%.2f", totalSum + 2);
    }
}
