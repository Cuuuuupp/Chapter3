
// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess;           //Number the user tries to guess
          int guess;                //The user's guess
 
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          //randomly generate the  number to guess
          numToGuess = generator.nextInt(9);
          //print message asking user to enter a guess
          System.out.println("Guess a number from 1 through 10");
          guess = scan.nextInt();
          //read in guess
                    
          while (guess != numToGuess)  //keep going as long as the guess is wrong
            {
                  //print message saying guess is wrong
                  System.out.println("Sorry thats wrong. Try again");
                  //get another guess from the user
                  guess = scan.nextInt();
          }
 
          //print message saying guess is right\
          System.out.println("Nice job! The correct answer is " + numToGuess);
        }
}