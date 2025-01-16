import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Function to generate a random guess within the range
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return low + random.nextInt(high - low + 1); // Generate a random number between low and high (inclusive)
    }

    // Function to get feedback from the user
    public static String getFeedback() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is the guess too high (H), too low (L), or correct (C)? ");
        return scanner.next().toUpperCase();
    }

    // Function to play the game
    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        int guess;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100, and I'll try to guess it!");

        while (!guessedCorrectly) {
            // Generate a guess
            guess = generateGuess(low, high);
            System.out.println("My guess is: " + guess);

            // Get feedback from the user
            String feedback = getFeedback();

            // Determine the next action based on feedback
            switch (feedback) {
                case "H": // Guess is too high
                    high = guess - 1;
                    break;
                case "L": // Guess is too low
                    low = guess + 1;
                    break;
                case "C": // Guess is correct
                    guessedCorrectly = true;
                    System.out.println("Yay! I guessed your number correctly!");
                    break;
                default:
                    System.out.println("Invalid input. Please enter H, L, or C.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        playGame();
    }
}
