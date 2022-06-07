package hexlet.code;

import hexlet.code.games.GameCalc;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameGCD;
import hexlet.code.games.GamePrime;
import hexlet.code.games.GameProgression;
import java.util.Scanner;

public class App {
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;

    public static void main(String[] args) {


        System.out.print("Please enter the game number and press Enter. \n 1 - Greet \n 2 - Even \n 3 - Calc");
        System.out.println(" \n 4 - GCD \n 5 - Progression \n 6 - Prime \n 0 - Exit");
        Scanner sc = new Scanner(System.in);
        int numberGames = sc.nextInt();

        System.out.println(" Your choice: " + numberGames + "\n");
        Cli wc = new Cli();
        String userName;

        switch (numberGames) {
            case GREET:
                wc.welcomeMessage();
                break;
            case EVEN:
                userName = wc.welcomeMessage();
                GameEven gameEven = new GameEven();
                gameEven.gameEven(userName);
                break;
            case CALC:
                userName = wc.welcomeMessage();
                GameCalc gameCalc = new GameCalc();
                gameCalc.gameCalc(userName);
                break;
            case GCD:
                userName = wc.welcomeMessage();
                GameGCD gameGCD = new GameGCD();
                gameGCD.gameGCD(userName);
                break;
            case PROGRESSION:
                userName = wc.welcomeMessage();
                GameProgression gameProgression = new GameProgression();
                gameProgression.gameProgression(userName);
                break;
            case PRIME:
                userName = wc.welcomeMessage();
                GamePrime gamePrime = new GamePrime();
                gamePrime.gamePrime(userName);
                break;
            default:
                break;
        }

    }
}
