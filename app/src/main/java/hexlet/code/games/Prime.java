package hexlet.code.games;
import java.util.Random;

public class Prime {
    public static String generateQuestion() {
        Random random = new Random();
        return String.valueOf(random.nextInt(100));
    }

    public static String getCorrectAnswer(String question) {
        int number = Integer.parseInt(question);

        if (number < 2) {
            return "no";
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return "no";
            }
        }

        return "yes";
    }

}

