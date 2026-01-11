import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        boolean Game = true;


        while (Game) {
        System.out.println("Welcome to the Number Guessing game!");
        System.out.println("Guess a number between 1 and 10!");
            int num = (int) (Math.random() * 10) + 1;
            int attempts = 3;
            while (attempts > 0) {
                System.out.print("Guess: ");
                int userGuess = userInput.nextInt();

                if (userGuess == num) {
                    System.out.println("Correct!");
                    break;
                } else {
                    attempts--;

                    if (attempts > 0) {
                        if (userGuess < num) {
                            System.out.println("Too low! Guesses remaining: " + attempts);
                        } else {
                            System.out.println("Too high! Guesses remaining: " + attempts);
                        }
                    } else {
                        System.out.println("Out of attempts! The correct number was: " + num);
                    }
                }
            }
            System.out.print("Do you want to play again? (y/n): ");
            String playAgain = userInput.next().toLowerCase();
            if (!playAgain.equals("y")) {
                Game = false;
                System.out.println("Thanks for playing!");
            }
        }
        userInput.close();
    }
}
