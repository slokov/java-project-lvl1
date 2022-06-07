package hexlet.code.games;

import hexlet.code.Engines;
import java.util.Scanner;

public class GameGCD {
    public static int gameGCD(String username) {

        Scanner sc = new Scanner(System.in);
        boolean gameON = true;
        boolean gameOff = false;
        int cntCorrect = 0;
        Engines engine = new Engines();

        System.out.println("Find the greatest common divisor of given numbers.");

        while (gameON) {
            int oneNum = engine.randomNumber();
            int twoNum = engine.randomNumber();


            System.out.println("Question: " + oneNum + " " + twoNum);

            System.out.print("Your answer: ");
            int answer = sc.nextInt();

            int answerGCD = doGCD(oneNum, twoNum);

            boolean status = engine.isEven(answer, answerGCD);

            gameON = engine.logicGame(username, status, String.valueOf(answerGCD), String.valueOf(answer));
            if (gameON == gameOff) {
                return 0;
            }

            cntCorrect += 1;
            gameON = engine.isWinner(cntCorrect, username);
        }

        return 0;
    }

    public static int doGCD(int x, int y) {
        while (x != 0 && y != 0) {
            if (x > y) {
                x = x % y;
            } else {
                y = y % x;
            }
        }
        return x + y;
    }
}
