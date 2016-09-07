/**
 * Represents the values of five dice named a, b, c, d, e.
 * 
 * @author Charles Scruggs
 * @version 10/28/2012
 */
public class Dice 
{
    
    /** The first die. */
    private final int a;
    
    /** The second die. */
    private final int b;
    
    /** The third die. */
    private final int c;
    
    /** The fourth die. */
    private final int d;
    
    /** The fifth die. */
    private final int e;
    
    /**
     * Constructs a new Dice object with the given face values.
     * 
     * @param a value of first die
     * @param b value of second die
     * @param c value of third die
     * @param d value of fourth die
     * @param e value of fifth die
     */
    public Dice(int a, int b, int c, int d, int e) 
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    /**
     * Adds the values of all dice together.
     * 
     * @return sum total of all dice values
     */
    public int addValues() 
    {
        return this.a + this.b + this.c + this.d + this.e;
    }
    
    /**
     * Counts how many dice have the given face value.
     * 
     * @param face value to look for (1 to 6)
     * @return number of dice that match (0 to 5)
     */
    public int countValues(int face) 
    {
        int count;
        count = 0;
        if (this.a == face) 
        {
            count = count + 1;
        }
        if (this.b == face) 
        {
            count = count + 1;
        }
        if (this.c == face) 
        {
            count = count + 1;
        }
        if (this.d == face) 
        {
            count = count + 1;
        }
        if (this.e == face) 
        {
            count = count + 1;
        }
        return count;
    }
    
}
