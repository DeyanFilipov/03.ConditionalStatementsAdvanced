package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class FruitorVegetable_09 {
    public static void main(String[] args) {
        Scanner scanenr = new Scanner(System.in);

        String food = scanenr.nextLine();

        switch (food) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;

            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
                break;
        }

    }
}
