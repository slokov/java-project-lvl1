package hexlet.code.games;

import hexlet.code.Engines;

import java.util.Scanner;

public class GameProgression {

    public static final int MINIMAL_NUMBER = 5;

    public static int gameProgression(String username) {
        Engines engine = new Engines();
        Scanner sc = new Scanner(System.in);
        boolean gameON = true;
        boolean gameOff = false;
        int cntCorrect = 0;


        System.out.println("What number is missing in the progression?");

        while (gameON) {
            System.out.print("Question: ");
            String[] arrayProgressive  = doProgression();

            int correctAnswer = doGetProgressionNumber(arrayProgressive);

            System.out.print("Your answer: ");
            int answer = sc.nextInt();

            boolean status = engine.isEven(correctAnswer, answer);

            gameON = engine.logicGame(username, status, String.valueOf(correctAnswer), String.valueOf(answer));

            if (gameON == gameOff) {
                return 0;
            }
            cntCorrect += 1;
            gameON = engine.isWinner(cntCorrect, username);
        }
        return 0;
    }

    public static String[] doProgression() {
        Engines engine = new Engines();

        int oneNum = engine.randomNumber();
        int twoNum = engine.randomNumber() + 1;
        int arrLength = oneNum + MINIMAL_NUMBER;

        String[] arr  = new String[arrLength];
        arr[0] = String.valueOf(oneNum);

        for (int i = 1; i <= arr.length - 1; i++) {

            arr[i] = String.valueOf(Integer.parseInt(arr[i - 1]) + twoNum);
        }

        return arr;
    }

    public static int doGetProgressionNumber(String[] arr) {
        int numArray = (int) Math.floor(Math.random() * arr.length);
        String num = arr[numArray];
        arr[numArray] = "..";
        for (String n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
        return Integer.parseInt(num);
    }

}
