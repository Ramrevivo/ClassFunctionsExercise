import java.util.Random;
import java.util.Scanner;

//asks 2 users to guess a number that getNumberInRange have randomized
public class Ex7 {
    public static void main(String[] args) {
        int secret = getNumberInRange(1, 1000);
        int counter = 0;
        boolean player1 = true;
        System.out.println(secret);
        boolean gameOver = false;

        do{
            if (player1){
                printTurn(1);
            }else {
                printTurn(2);
            }
            int guess = getUserGuess();
            boolean success = checkGuessAndHint(secret,guess);
            if (success){
                gameOver = true;
                System.out.println("you won!");
                if (player1){
                    System.out.println("player 1 is the winner");
                } else{
                    System.out.println("player 2 is the winner");
                }

            }
            counter++;
            player1 = !player1;
        } while (!gameOver);
        System.out.println("total tries: " + counter);
    }

    public static int getUserGuess() {
        Scanner scanner = new Scanner(System.in);
        int firstOpponentGuess = scanner.nextInt();
        return firstOpponentGuess;
    }

    public static int getNumberInRange(int min, int max) {
        Random random = new Random();
        int number = random.nextInt(max - min) + min;
        return number;
    }


    public static boolean checkGuessAndHint(int guess, int secret){
        boolean success;
        if (guess == secret ){
            success = true;
        } else{
            success = false;
            if (guess > secret){
                System.out.println("the secret number is bigger");
            }else{
                System.out.println("the secret number is smaller");
            }
        }return success;

    }

    public static void printTurn(int playerNumber){
        System.out.println("its player " + playerNumber + "'s turn");
    }
}


