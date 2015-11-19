
/**
 * Human is a Creature subtype.
 * 
 * @author Maria Langman 
 * @version 2015.11.15
 */
public class Human extends Creature
{
    private final int MAX_HP = 30;
    private final int MAX_STR = 18;

    /**
     * No-arg Constructor for object of class Human has characteristics of Creature, so must call the super method.
     */
    public Human()
    {
        super();
    }

    /**
     * Constructor for object of class Human with parameters calls the Creature constructor with same signature
     * but then makes sure that hp and str are within range of maximum values.
     */
    public Human(int hp, int str)
    {
        super(hp, str);
        setHP(hp);      
        setStrength(str);
    }

    /**
     * set hitPoints for Human object to be less than MAX_HP.
     * @param hp The designated hitPoints but restricted to MAX_HP.
     */
    public void setHP(int hp)
    {
        if (hp > MAX_HP)
        {
            System.out.println("Hitpoints set at " + MAX_HP + ", maximum allowable.");  //for testing
            super.setHP(MAX_HP);
        }
        else
        {
            super.setHP(hp);
        }

    }

    /**
     * set strength for Human object to be less than MAX_HP.
     * @param str The designated strength but restricted to MAX_STR.
     */
    public void setStrength(int str)
    {
        if (str > MAX_STR)
        {
            System.out.println("Strength will be set at " + MAX_STR + ", maximum allowable.");  //for testing
            super.setStrength(MAX_STR);
        }
        else
        {
            super.setStrength(str);
        }

    }
}
