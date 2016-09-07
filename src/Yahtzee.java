/**
 * Computes the scores for Yahtzee, a dice game by Milton Bradley.
 * 
 * This problem is a simplified version of PA5 from Stanford's CS106A:
 * http://see.stanford.edu/see/materials/icspmcs106a/assignments.aspx
 * 
 * @author Charles Scruggs
 * @version 10/28/2012
 */

/**
 * 					References and Acknowledgements: 
 * I recieved help from TA's: Roxy, Casey
 * with full house and three of a kind 
 * methods and debugging them.	
 */
public class Yahtzee 
{
    
    // constants that specify categories on the score sheet
    public final int ONES = 1;
    public final int TWOS = 2;
    public final int THREES = 3;
    public final int FOURS = 4;
    public final int FIVES = 5;
    public final int SIXES = 6;
    public final int THREE_OF_A_KIND = 9;
    public final int FOUR_OF_A_KIND = 10;
    public final int FULL_HOUSE = 11;
    public final int SMALL_STRAIGHT = 12;
    public final int LARGE_STRAIGHT = 13;
    public final int YAHTZEE = 14;
    public final int CHANCE = 15;
    
    /**
     * Calculates the score for a given turn.
     * 
     * @param category selected by the player
     * @param dice current values of the dice
     * @return number of points, or 0 if N/A
     */
    public int calculateScore(int category, Dice dice) 
    {
      
        int returnValue;
              
        // replace this with a switch statement to invoke the appropriate 
        // method from below, passing it the correct parameter(s) and saving its return value
        returnValue = 0;
      
        switch (category) 
        {
        
        case ONES: returnValue = oneValue(1, dice);
        		break;
        
        case TWOS: returnValue = oneValue(2, dice); 
        		break;
        		
        case THREES: returnValue = oneValue(3, dice);
        		break;
        
        case FOURS: returnValue = oneValue(4, dice);
				break;
        
        case FIVES: returnValue = oneValue(5, dice);
				break;
        
        case SIXES: returnValue = oneValue(6, dice);
				break;
        
        case THREE_OF_A_KIND: returnValue = threeOfAKind(dice);
				break;
        
        case FOUR_OF_A_KIND: returnValue = fourOfAKind(dice);
				break;
        
        case FULL_HOUSE: returnValue = fullHouse(dice);
				break;
        
        case SMALL_STRAIGHT: returnValue = smallStraight(dice);
				break;
        
        case LARGE_STRAIGHT: returnValue = largeStraight(dice);
				break;
        
        case YAHTZEE: returnValue = yahtzee(dice);
				break;
        
        case CHANCE: returnValue = chance(dice);
				break;
        	
        }
        
        return returnValue;
        
    }
    
    // used to score ONES through SIXES
    
    
    /*****************************************************************
     * this method calculates the points for only one dice face 
     *
     * @param dice The object containing the 5 dice rolled
     * @return returns the value of the sum of one type of number
     * or the value is zero if that number is not rolled
     *****************************************************************/
    public int oneValue(int value, Dice dice) 
    {
    	return dice.countValues(value) * value;
    }
  
    
    /*****************************************************************
    * this method adds the faces of 3 of a kind
    *
    * @param dice The object containing the 5 dice rolled
    * @return returns the value of three of a kind or zero if there is
    * no three of a kind
    *****************************************************************/
    public int threeOfAKind(Dice dice) 
    {
    	int score;
    	score = 0;
    	
      if (dice.countValues(1) >= 3 || dice.countValues(2) >= 3 || 
    	  dice.countValues(3) >= 3 || dice.countValues(4) >= 3 ||
    	  dice.countValues(5) >= 3 || dice.countValues(6) >= 3)
      {
    	  score = dice.addValues();
      }
      
      else 
      {
    	  score = 0;
      }
      
      return score;
    }
    
    
    /*****************************************************************
     * this method adds the sum of four of a kind
     *
     * @param dice The object containing the 5 dice rolled
     * @return returns the value of four of a kind or zero if there is
     * no four of a kind
     *****************************************************************/
    public int fourOfAKind(Dice dice) 
    {
    	int score;
    	score = 0;
    	
      if (dice.countValues(1) == 4 || dice.countValues(2) == 4 || 
          dice.countValues(3) == 4 || dice.countValues(4) == 4 ||
          dice.countValues(5) == 4 || dice.countValues(6) == 4) 
      {
    	  score = dice.addValues();
      }
      
      else 
      {
    	  score = 0;
      }
      
      return score;
    }
    

    /*****************************************************************
     * this method determines if 2 of the same and 3 of the same are rolled
     *
     * @param dice The object containing the 5 dice rolled
     * @return returns the value of a full house or zero if 
     * there is no full house
     *****************************************************************/
    public int fullHouse(Dice dice) 
    {
    	int score;
    	score = 0;
    	
      if ((dice.countValues(1) == 2 || dice.countValues(2) == 2 ||
    	  dice.countValues(3) == 2 || dice.countValues(4) == 2 || 
    	  dice.countValues(5) == 2 || dice.countValues(6) == 2) &&
    	  (dice.countValues(1) == 3 || dice.countValues(2) == 3 ||
    	  dice.countValues(3) == 3 || dice.countValues(4) == 3 ||
    	  dice.countValues(5) == 3 || dice.countValues(6) == 3)) 
      {
    	  score = 25;
      }
      
      else 
      {
    	  score = 0;
      }
      
      return score;
    }
    
    
    /*****************************************************************
     * this method gives the score for 4 sequential faces rolled
     *
     * @param dice The object containing the 5 dice rolled
     * @return returns the value of a small straight or zero
     * if there is not 4 sequential numbers
     *****************************************************************/
    public int smallStraight(Dice dice) 
    {
    	int score;
    	score = 0;
    	
      if (dice.countValues(1) >= 1 && dice.countValues(2) >= 1 && 
    	  dice.countValues(3) >= 1 && dice.countValues(4) >= 1 ||
    	  dice.countValues(2) >= 1 && dice.countValues(3) >= 1 &&
    	  dice.countValues(4) >= 1 && dice.countValues(5) >= 1 ||
    	  dice.countValues(3) >= 1 && dice.countValues(4) >= 1 &&
    	  dice.countValues(5) >= 1 && dice.countValues(6) >= 1) 
      {
    	  score = 30;
      }
      
      else 
      {
    	  score = 0;
      }
      
      return score;
    }
    
    
    /*****************************************************************
     * this method gives the score for 5 sequential faces rolled
     *
     * @param dice The object containing the 5 dice rolled
     * @return returns the value of a large straight or zero
     *  if there is not 5 sequential numbers
     *****************************************************************/
    public int largeStraight(Dice dice) 
    {
    	int score;
    	score = 0;
    	
      if ((dice.countValues(1) == 1 && dice.countValues(2) == 1 && 
          dice.countValues(3) == 1 && dice.countValues(4) == 1 &&
          dice.countValues(5) == 1) || (dice.countValues(2) == 1 && 
          dice.countValues(3) == 1 && dice.countValues(4) == 1 && 
          dice.countValues(5) == 1 && dice.countValues(6) == 1)) 
      {
    	  score = 40;
      }
      
      else 
      {
    	  score = 0;
      }
      
      return score;
    }
    
    
    /*****************************************************************
     * this method awards 50 points if 5 of the same are rolled
     *
     * @param dice The object containing the 5 dice rolled
     * @return returns the value of yahtzee or zero if there
     * is not four of the same face rolled
     *****************************************************************/
    public int yahtzee(Dice dice) 
    {
    	int score;
    	score = 0;
    	
      if (dice.countValues(1) == 5 || dice.countValues(2) == 5 ||
    	  dice.countValues(3) == 5 || dice.countValues(4) == 5 ||
    	  dice.countValues(5) == 5 || dice.countValues(6) == 5) 
      {
    	  score = 50;  
      }
      
      else 
      {
    	  score = 0;
      }
      
      return score;
    }
    
   
    /*****************************************************************
     * this method adds the values of all dice rolled
     *
     * @param dice The object containing the 5 dice rolled
     * @return returns the value of the sum of the dice rolled
     *****************************************************************/
    public int chance(Dice dice) 
    {
      return dice.addValues();
    }
    
}
