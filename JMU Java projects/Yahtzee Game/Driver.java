import java.util.Scanner;

/**
 * This class provides a user interface for demonstrating the function
 * of the yahtzee class.
 * 
 * @author Charles Scruggs
 * @version 10/28/2012
 */
public class Driver {
 
  /**
   * Simulates one turn of a yahtzee game:
   * 1. generate five random dice values and instantiate a Dice object
   * 2. display the dice and ask the user how to score them
   * 3. invoke yahtzee.calculateScore() to score the dice
   * 4. display the score.
   * 
   * @param args Command line arguments - not used
   */
  public static void main(String[] args) 
  {
    
    int die1;
    int die2;
    int die3;
    int die4;
    int die5;
    
    int choice;
    Scanner keyboard;
    Dice dice;
    Yahtzee yahtzee;
    
    die1 = 2;//(int)(Math.random() * 6) + 1;
    die2 = 2;//(int)(Math.random() * 6) + 1;
    die3 = 2;//(int)(Math.random() * 6) + 1;
    die4 = 4;//(int)(Math.random() * 6) + 1;
    die5 = 4;//(int)(Math.random() * 6) + 1;
    
    keyboard = new Scanner(System.in);

    dice = new Dice(die1, die2, die3, die4, die5);
    yahtzee = new Yahtzee();
    
    System.out.println("You rolled: " + die1 + ", " + die2 + ", " + die3 + ", "
       + die4 + ", " + die5);
    
    System.out.println("How would you like to play them?");
    System.out.println("Ones: " + yahtzee.ONES);
    System.out.println("Twos: " + yahtzee.TWOS);    
    System.out.println("Threes: " + yahtzee.THREES);    
    System.out.println("Fours: " + yahtzee.FOURS);    
    System.out.println("Fives: " + yahtzee.FIVES);    
    System.out.println("Sixes: " + yahtzee.SIXES);    
    System.out.println("Three of a kind: " + yahtzee.THREE_OF_A_KIND);    
    System.out.println("Four of a kind: " + yahtzee.FOUR_OF_A_KIND);    
    System.out.println("Full House: " + yahtzee.FULL_HOUSE);    
    System.out.println("Small Straight: " + yahtzee.SMALL_STRAIGHT);    
    System.out.println("Large Straight: " + yahtzee.LARGE_STRAIGHT);    
    System.out.println("yahtzee: " + yahtzee.YAHTZEE);    
    System.out.println("Chance: " + yahtzee.CHANCE);    
    choice = keyboard.nextInt();
    
    if (choice >= yahtzee.ONES && choice <= yahtzee.SIXES 
          || choice >= yahtzee.THREE_OF_A_KIND && choice <= yahtzee.CHANCE) 
    {
       System.out.println("The value of your roll is: " + yahtzee.calculateScore(choice, dice));
    }
    
  }
  
}