package hexlet.code.games;

import hexlet.code.Engines;
import java.util.Scanner;

public class GameEven {
    public static int gameEven(String username) {
        Scanner sc = new Scanner(System.in);
        boolean gameON = true;
        boolean gameOff = false;
        int cntCorrect = 0;
        Engines engine = new Engines();
        System.out.println("Answer \'yes\' if number even otherwise answer \'no\'.");

        while (gameON) {
            int rndNum = engine.randomNumber();

            System.out.println("Question: " + rndNum);

            System.out.print("Your answer: ");
            String answer = sc.nextLine();

            boolean status = engine.isEven(rndNum, answer);
            String correctAnswer = reversAnswer(status, answer);

            gameON = engine.logicGame(username, status, correctAnswer, answer);
            if (gameON == gameOff) {
                return 0;
            }
            cntCorrect += 1;
            gameON = engine.isWinner(cntCorrect, username);
        }
        return 0;
    }

    public static String reversAnswer(boolean bl, String answer) {
        boolean booleanAnswer = false;
        if (bl == booleanAnswer) {
            if (answer.equals("yes")) {
                return "no";
            }
            return "yes";
        }
        return answer;
    }
}
