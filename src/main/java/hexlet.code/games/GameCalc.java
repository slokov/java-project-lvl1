package hexlet.code.games;

import hexlet.code.Engines;
import java.util.Random;
import java.util.Scanner;

public class GameCalc {

    public static final int RANDOM_SYMBOL = 3;

    public static int gameCalc(String username) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean gameON = true;
        boolean gameOff = false;
        int cntCorrect = 0;
        Engines engine = new Engines();

        System.out.println("What is the result of the expression?");

        while (gameON) {
            int oneNum = engine.randomNumber();
            int twoNum = engine.randomNumber();
            char method = "+-*".charAt(random.nextInt(RANDOM_SYMBOL));

            System.out.println("Question: " + oneNum + " " + method + " " + twoNum);

            System.out.print("Your answer: ");
            int answer = sc.nextInt();

            int answerCalc = doCalc(oneNum, twoNum, method);

            boolean status = engine.isEven(answer, answerCalc);

            gameON = engine.logicGame(username, status, String.valueOf(answerCalc), String.valueOf(answer));
            if (gameON == gameOff) {
                return 0;
            }

            cntCorrect += 1;
            gameON = engine.isWinner(cntCorrect, username);
        }
        return 0;
    }

    public static int doCalc(int a, int b, char symbol) {
        switch (symbol) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            default:
                return 0;
        }
    }
}
