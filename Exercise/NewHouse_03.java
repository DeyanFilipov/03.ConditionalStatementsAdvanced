package ConditionalStatementsAdvanced.Exercise;

import java.util.EnumMap;
import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double result = 0;
        double difference = 0.0;
        double roses = numFlowers * 5;
        double dahlias = numFlowers * 3.8;
        double tulips = numFlowers * 2.8;
        double narcissus = numFlowers * 3;
        double gladiolus = numFlowers * 2.5;

        if (flower.equalsIgnoreCase("Roses")) {
            if (numFlowers > 80) {
                result = roses - (roses * 0.1);
            } else if (numFlowers <= 80) {
                result = roses;
            }
        }
        if (flower.equalsIgnoreCase("Dahlias")) {
            if (numFlowers > 90) {
                result = dahlias - (dahlias * 0.15);
            } else if (numFlowers <= 90) {
                result = dahlias;
            }
        }
        if (flower.equalsIgnoreCase("Tulips")) {
            if (numFlowers > 80) {
                result = tulips - (tulips * 0.15);
            } else if (numFlowers <= 80) {
                result = tulips;
            }
        }
        if (flower.equalsIgnoreCase("Narcissus")) {
            if (numFlowers < 120) {
                result = narcissus + (narcissus * 0.15);
            } else if (numFlowers >= 120) {
                result = narcissus;
            }
        }
        if (flower.equalsIgnoreCase("Gladiolus")) {
            if (numFlowers < 80) {
                result = gladiolus + (gladiolus * 0.20);
            } else if (numFlowers >= 80) {
                result = gladiolus;
            }
        }
        if (budget >= result) {
            difference = budget - result;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, flower, difference);

        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", result - budget);
            }
        }
    }
