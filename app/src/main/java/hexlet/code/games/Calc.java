package hexlet.code.games;

import java.util.Random;

public class Calc {
    public static String generateQuestion() {
        Random random = new Random();
        char[] signs = {'+', '-', '*'};
        char randomSign = signs[random.nextInt(signs.length)];

        int firstNumber = random.nextInt(100);
        int secondNumber = random.nextInt(100);

        return firstNumber + " " + randomSign + " " + secondNumber;
    }

    public static String getCorrectAnswer(String question) {
        String[] parts = question.split(" ");

        int firstNumber = Integer.parseInt(parts[0]);
        int secondNumber = Integer.parseInt(parts[2]);
        String sign = parts[1];

        int result;

        switch (sign) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            default:
                throw new IllegalArgumentException("Unknown operation: " + sign);
        }

        return String.valueOf(result);
    }
}
