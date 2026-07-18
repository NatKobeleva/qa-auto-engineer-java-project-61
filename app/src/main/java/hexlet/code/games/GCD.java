package hexlet.code.games;
import java.util.Random;

public class GCD {
    public static String generateQuestion() {
        Random random = new Random();
        int firstNumber = random.nextInt(100) + 1;
        int secondNumber = random.nextInt(100) + 1;

        return firstNumber + " " + secondNumber;
    }

    public static String getCorrectAnswer(String question) {
        String[] parts = question.split(" ");

        int firstNumber = Integer.parseInt(parts[0]);
        int secondNumber = Integer.parseInt(parts[1]);

        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }

        return String.valueOf(firstNumber);
    }

}
