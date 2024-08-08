import java.util.Random; 
import java.util.Scanner;
class NumberGame { 
public static void main(String args[]) { 
Scanner scan = new Scanner(System.in);
Random rand = new Random();
int score = 0;
boolean wantToPlayAgain = true;
while (wantToPlayAgain) {
int numToGuess = rand.nextInt(100) + 1;
int numOfAtempts = 0;
boolean guessCorrect = false;
System.out.println("-----NUMBER GAME-----"); 
System.out.println( "Guess any number between 1 to 100 in Only 5 attempts" ); 
while ( !guessCorrect && numOfAtempts < 5) { 
System.out.print("Guess a number: ");
int userNum = scan.nextInt();
numOfAtempts++;
if (userNum == numToGuess) { 
System. out. println("Congratulations! Yes, your guess is right." ); 
guessCorrect = true;
score++;
} else if (userNum > numToGuess) {
    System.out.println("It's high! You have crossed the number...");
} else { 
System.out.println("It's low! Come on, you can do it...");
} 
}
if(!guessCorrect) { 
System.out.println("sorry...try again.The number is: " + numToGuess);
} 
System.out.println("Do you want to guess again? (yes/no): ");
wantToPlayAgain = scan.next().equalsIgnoreCase("yes"); 
} 
System.out.println("You Scored: " + score);
scan.close();
} 
}