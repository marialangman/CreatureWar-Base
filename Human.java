
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
     * Constructor for object of class Human has characteristics of Creature, so must call the super method.
     */
    public Human()
    {
        super();
    }

    /**
     * set hitPoints for Human object to be less than MAX_HP.
     * @param hp The designated hitPoints but restricted to MAX_HP.
     */
    public void setHP(int hp)
    {
        if (hp > MAX_HP)
        {
           System.out.println("Hitpoints for humans will be set at " + MAX_HP + ", maximum allowable.");
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
            System.out.println("Strength for humans will be set at " + MAX_STR + ", maximum allowable.");
            super.setStrength(MAX_STR);
        }
        else
        {
            super.setStrength(str);
        }

    }

}
