package hexlet.code.games;

import java.util.Random;

public class Progression {

    private static String correctAnswer;

    public static String generateQuestion() {
        Random random = new Random();

        int length = random.nextInt(6) + 5;
        int firstTerm = random.nextInt(20) + 1;
        int step = random.nextInt(10) + 1;
        int hiddenPos = random.nextInt(length);

        StringBuilder question = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int current = firstTerm + i * step;

            if (i == hiddenPos) {
                correctAnswer = String.valueOf(current);
                question.append("..");
            } else {
                question.append(current);
            }

            if (i < length - 1) {
                question.append(" ");
            }
        }

        return question.toString();
    }

    public static String getCorrectAnswer(String question) {
        return correctAnswer;
    }
}

