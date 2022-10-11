package ConditionalStatementsAdvanced.MoreExercise;

import java.util.Scanner;

public class MatchTickets_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String membership = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double tickets = 0.0;
        double transport = 0.0;

        if (people < 5)
        {
            transport = budget * 0.75;
        }
        else if (people < 10)
        {
            transport = budget * 0.60;
        }
        else if (people < 25)
        {
            transport = budget * 0.50;
        }
        else if (people < 50)
        {
            transport = budget * 0.40;
        }
        else
        {
            transport = budget * 0.25;
        }
        switch (membership) {
            case "Normal":
                tickets = people * 249.99;
                break;
            case "VIP":
                tickets = people * 499.99;
                break;
            default:
                tickets = people * 249.99;
                break;

        }
        double moneyLeft = budget - transport;
        double left = Math.abs(moneyLeft - tickets);
        if (tickets > moneyLeft)
        {
            System.out.printf("Not enough money! You need %.2f leva.", left);
        }
        else
        {
            System.out.printf("Yes! You have %.2f leva left.", left);
        }
    }
}