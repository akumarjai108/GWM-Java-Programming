import java.util.Scanner;
import java.util.Random;

public class Guess_the_Number {

    public static void main(String[] args) {

        // Number Guessing Game :

        // Create a Scanner class for taking input from user:
        Scanner src = new Scanner(System.in);
        // Let's play the game:
        String play = "yes";

        while(play.equals("yes")){
            Random rand = new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;

            while(guess != randNum){
                // User enter their guess number between 1 and 100
                System.out.print("Guess a Number between 1 and 100:");
                guess = src.nextInt();
                tries++;

                // Check if guessing number is correct :
                if(guess == randNum){
                    // User guessed correctly, so he come out from the loop
                    System.out.println("Awesome! You guessed the number!");
                    // How much tries the user takes :
                    System.out.println("It only took you " + tries + " guesses!");
                    // If the user wants to play again than the user type simply Yes and if the user does not want to play again than type simply No :
                    System.out.println("Would You play to like again? Yes or No: ");
                    play = src.next().toLowerCase();
                } else if (guess > randNum) {
                    // If the user's guessing number is to high from the guessed number so, the user will be Try again :
                    System.out.println("Your guess is to high, Try again!");
                }
                else {
                    // If the user's guessing number is to low from the guessed number so, the user will be Try again :
                    System.out.println("Your guess is to low, Try again!");
                }
            }
        }
        // close the scanner class
        src.close();
    }
}
