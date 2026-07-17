package hexlet.code.games;
import java.util.Random;

public class Even {

    public static String generateQuestion() {
        Random random = new Random();
        return String.valueOf(random.nextInt(100));
    }

    public static String getCorrectAnswer(String question) {
        int number = Integer.parseInt(question);

        return number % 2 == 0 ? "yes" : "no";
    }
}