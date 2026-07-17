package hexlet.code;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;

public class Engine {

    public static void run(
            String description,
            Supplier<String> questionGenerator,
            Function<String, String> answerChecker,
            String name
    ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(description);
        int round = 0;

        while (round < 3) {

            String question = questionGenerator.get();
            System.out.println("Question: " + question);

            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);

            String correctAnswer = answerChecker.apply(question);
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                round++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
