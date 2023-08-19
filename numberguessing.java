package letStart;
import java.util.Scanner; //user input 
import java.util.Random; //generating random numbers
public class numberguessing {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        
	        int lowerBound = 1;
	        int upperBound = 100; //range of numbers
	        int maxAttempts = 10;
	        int score = 0;
	        
	        boolean playAgain = true; // whether the player wants to play another round
	        
	        System.out.println("Welcome to the Number Guessing Game!");
	        
	        while (playAgain) { //This loop will keep running as long as the player wants to play again (playAgain is true).
	        	 int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
	             int attempts = 0;
	             boolean guessedCorrectly = false;//whether the user has guessed the correct number or not.
	             
	             System.out.println("I've generated a number between " + lowerBound + " and " + upperBound + ".");
	             
	             while (attempts < maxAttempts && !guessedCorrectly) {
	                 System.out.print("Enter your guess: ");
	                 int userGuess = scanner.nextInt();
	                 attempts++;
	                 
	                 if (userGuess == targetNumber) {
	                     System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
	                     score += (maxAttempts - attempts); // Update the score based on the number of attempts
	                     guessedCorrectly = true;
	                 } else if (userGuess < targetNumber) {
	                     System.out.println("Your guess is too low. Try again.");
	                 } else {
	                     System.out.println("Your guess is too high. Try again.");
	                 }
	             }
	             
	             if (!guessedCorrectly) {
	                 System.out.println("Sorry, you've run out of attempts. The correct number was " + targetNumber + ".");
	             }
	             
	             System.out.println("Your score for this round is: " + (maxAttempts - attempts));//here score is out of 10.
	             
	             System.out.print("Do you want to play again? (yes/no): ");
	             String playAgainResponse = scanner.next();
	             playAgain = playAgainResponse.equalsIgnoreCase("yes");
	         }
	         
	         System.out.println("Game over! Your total score is " + score + ".");
	     }
}
