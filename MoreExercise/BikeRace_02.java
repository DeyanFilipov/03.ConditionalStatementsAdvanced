package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class BikeRace_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstRow = Double.parseDouble(scanner.nextLine());
        double secondRow = Double.parseDouble(scanner.nextLine());

        String thirdRow = scanner.nextLine();

        double priceJ = 0;
        double participants = firstRow + secondRow;
        switch (thirdRow) {
            case "trail":
                priceJ = firstRow * 5.50 + secondRow * 7;
                break;
            case "cross-country":
                if (participants >= 50) {
                    priceJ = (firstRow * 8 + secondRow * 9.50) * 0.75;
                } else {
                    priceJ = firstRow * 8 + secondRow * 9.50;
                }
                break;
            case "downhill":
                priceJ = firstRow * 12.25 + secondRow * 13.75;
                break;
            case "road":
                priceJ = firstRow * 20 + secondRow * 21.50;
                break;
                }
        System.out.printf("%.2f", priceJ * 0.95);
        }

    }