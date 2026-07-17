package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Games {

    public static void even(String name) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var round = 0;

        while (round < 3) {
            int number = random.nextInt(100);
            System.out.println("Question: " + number);

            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);

            String correctAnswer = isEven(number) ? "yes" : "no";

            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                round++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");

    }

    public static void calc(String name){

    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
