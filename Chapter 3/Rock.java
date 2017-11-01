// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;//User's play -- "R", "P", or "S"
        String computerPlay ="";  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        //Get player's play -- note that this is stored as a string
        System.out.print ("Choose Rock, Paper or Scissors. Your Choice: ");
        personPlay = scan.next();
        //Make player's play uppercase for ease of comparison
        personPlay = personPlay.toUpperCase();
        //Generate computer's play (0,1,2)
        computerInt = rand.nextInt(2);
        //Translate computer's randomly generated play to string
        if (computerInt == 1) {
            computerPlay = "ROCK";
            }
        if (computerInt == 0) {
            computerPlay = "PAPER";
        }
        if (computerInt == 2) {
            computerPlay = "SCISSORS";
        }
        //Print computer's play
        System.out.println ("your opponent chooses " + computerPlay);
        //See who won.
        if (computerPlay.equals(personPlay)) {
            System.out.println("You tied!");
        }
        if (computerPlay.equals("ROCK") && personPlay.equals("PAPER")){
            System.out.println("You Won!");
        }
        if (computerPlay.equals("PAPER") && personPlay.equals("SCISSORS")){
            System.out.println("You Won!");
        }
        if (computerPlay.equals("SCISSORS") && personPlay.equals("ROCK")){
            System.out.println("You Won!");
        }
        if (computerPlay.equals("ROCK") && personPlay.equals("SCISSORS")){
            System.out.println("You LOST!");
        }
        if (computerPlay.equals("SCISSORS") && personPlay.equals("PAPER")){
            System.out.println("You LOST!");
        }
        if (computerPlay.equals("PAPER") && personPlay.equals("ROCK")){
            System.out.println("You LOST!");
        }
        
    }
}

