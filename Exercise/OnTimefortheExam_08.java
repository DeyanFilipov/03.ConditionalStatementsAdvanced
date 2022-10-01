package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OnTimefortheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hoursExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hoursArrival = Integer.parseInt(scanner.nextLine());
        int minutesArrival = Integer.parseInt(scanner.nextLine());

        int examAllMin = hoursExam * 60 + minutesExam;
        int arrivalMin = hoursArrival * 60 + minutesArrival;

        if((examAllMin >= arrivalMin) && (examAllMin - arrivalMin <= 30)) {
            System.out.println("On time");
            if (examAllMin - arrivalMin >= 1) {
                System.out.printf("%d minutes before the start", examAllMin - arrivalMin);
            }
        } else if (arrivalMin < examAllMin - 30) {
            System.out.println("Early");
            if (examAllMin - arrivalMin >= 60) {
                System.out.printf("%d:%02d hours before the start", (examAllMin - arrivalMin) / 60, (examAllMin - arrivalMin) % 60);
            } else {
                System.out.printf("%d minutes before the start", examAllMin - arrivalMin);
            }
        } else if (arrivalMin > examAllMin) {
            System.out.println("Late");
            if (arrivalMin - examAllMin >= 60) {
                System.out.printf("%d:%02d hours after the start", (arrivalMin - examAllMin) / 60, (arrivalMin - examAllMin) % 60);
            } else {
                System.out.printf("%d minutes after the start", arrivalMin - examAllMin);
            }
        }
    }
}