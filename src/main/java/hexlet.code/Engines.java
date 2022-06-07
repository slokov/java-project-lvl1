package hexlet.code;
public class Engines {

    public static final boolean TRUE_ANSWER = true;
    public static final int COUNT_ANSWER = 3;
    public static final int MAX_NUMBER = 10;

    public static boolean logicGame(String username, boolean status, String correctAns, String wrongAns) {
        if (status == TRUE_ANSWER) {
            System.out.println("Correct!");
        } else {
            System.out.println("\'" + wrongAns + "\' is wrong answer ;(. Correct answer was \'" + correctAns + "'.\n"
                    + "Let\'s try again, " + username + "!");

            return false;
        }
        return true;
    }

    public static boolean isWinner(int cnt, String username) {
        if (cnt == COUNT_ANSWER) {
            System.out.println("Congratulations, " + username + "!");
            return false;
        }
        return true;
    }

    public static int randomNumber() {
        return (int) (Math.random() * MAX_NUMBER);
    }


    public static boolean isEven(int num, String answer) {
        if (answer.equals("yes") || answer.equals("no")) {
            boolean evenCheck = num % 2 == 0;
            boolean answerCheck = isAnswer(answer);
            return evenCheck == answerCheck;
        } else {
            return false;
        }

    }

    public static boolean isEven(int numOne, int numTwo) {
        if (numOne == numTwo) {
            return true;
        }
        return false;
    }

    public static boolean isAnswer(String answer) {
        return answer.equals("yes");
    }


    public static boolean isAnswerString(String correctAnswer, String answer) {
        return answer.equals(correctAnswer);
    }
}
