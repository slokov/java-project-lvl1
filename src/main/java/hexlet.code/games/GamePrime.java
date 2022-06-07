package hexlet.code.games;

import hexlet.code.Engines;
import java.util.Scanner;

public class GamePrime {
    public static int gamePrime(String username) {

        Engines engine = new Engines();
        Scanner sc = new Scanner(System.in);
        boolean gameON = true;
        boolean gameOff = false;
        int cntCorrect = 0;


        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        while (gameON) {
            int oneNum = engine.randomNumber();
            System.out.println("Question: " + oneNum);
            String correctAnswer = doCheckPrime(oneNum);

            System.out.print("Your answer: ");
            String answer = sc.nextLine();

            boolean status = engine.isAnswerString(correctAnswer, answer);

            gameON = engine.logicGame(username, status, correctAnswer, answer);

            if (gameON == gameOff) {
                return 0;
            }

            cntCorrect += 1;
            gameON = engine.isWinner(cntCorrect, username);
        }
        return 0;
    }

    public static String doCheckPrime(int number) {

        if (number < 2) {
            return "no";
        }
        double s = (int) Math.sqrt(number);
        for (int j = 2; j <= s; j++) {
            if (number % j == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
