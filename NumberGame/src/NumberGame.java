import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 5;
        int score = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        do {
            int secretNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            System.out.println("I have generated a number between" + lowerBound + "and" + upperBound + ".");
            int attempts = 0;
            while (attempts < maxAttempts) {
                System.out.println("Enter your guess:");
                int guess = scanner.nextInt();
                attempts++;
                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number in" + attempts + "attempts!");
                    score++;
                    break;
                } else if (guess < secretNumber) {
                    System.out.println("Your guess is too low. Try again");
                } else {
                    System.out.println("Your guess is too high. Try again");
                }
            }
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was:" + secretNumber);
            }
            System.out.println("Do you want to play again? (yes/no):");
        } while (scanner.next().equalsIgnoreCase("Yes"));
        System.out.println("Thank you for playing! Your total score is:" + score);
        scanner.close();
    }
}
