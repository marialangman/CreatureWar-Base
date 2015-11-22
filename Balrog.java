
/**
 * Balrog is a Demon subtype that attacks twice each round.
 * 
 * @author Maria Langman
 * @version 2015.11.15
 */
public class Balrog extends Demon
{
    /**
     * No-arg Constructor for Balrog object
     *
     */
    public Balrog()
    {
        super();
    }
    /**
     * Constructor for Balrog object with parameters to set hitPoints and strength
     * @param hp Use to set hitPoints
     * @param str Use to set strength
     */
    public Balrog(int hp, int str)
    {
        super(hp, str);
    }
}