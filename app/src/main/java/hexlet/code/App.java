package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");

        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        String name = null;

        switch (choice){
            case 1:
                Cli.greetingUser();
                break;
            case 2:
                name = Cli.greetingUser();

                Engine.run(
                        "Answer 'yes' if the number is even, otherwise answer 'no'.",
                        Even::generateQuestion,
                        Even::getCorrectAnswer,
                        name
                );
                break;
            case 3:
                name = Cli.greetingUser();
                Engine.run(
                        "What is the result of the expression?",
                        Calc::generateQuestion,
                        Calc::getCorrectAnswer,
                        name
                );
                break;
            case 4:
                name = Cli.greetingUser();
                Engine.run(
                        "Find the greatest common divisor of given numbers.",
                        GCD::generateQuestion,
                        GCD::getCorrectAnswer,
                        name
                );
                break;
            case 5:
                name = Cli.greetingUser();
                Engine.run(
                        "What number is missing in the progression?",
                        Progression::generateQuestion,
                        Progression::getCorrectAnswer,
                        name
                );
                break;
            case 0:
                break;

        }


    }
}

