import java.util.Random;
/**
 * Creature class is a a superclass that has default hitpoints and strength set at initialization.
 * Other subtypes will inherit from this superclass.
 * 
 * @author Maria Langman 
 * @version 2015.11.15
 */
public class Creature
{
    private int hitPoints;
    private int strength;
    private final int MIN_HP = 5;
    private final int MIN_STR = 5;
    protected Random randomGenerator;

    /**
     * Constructor for a Creature object default values for hitpoints and strength to 10 each.
     * Create a Random object to be used by superclass and other subclasses extending from Creature.
     */
    public Creature(){
        hitPoints = 10;
        strength = 10;
        randomGenerator = new Random();
    }

    /**
     * setHP allows hitPoints to be set
     * @param hp The designated hp, which cannot be less than MIN_HP.
     */
    public void setHP(int hp)
    {
        if (hp < MIN_HP)
        {
            hitPoints = 5;
            System.out.println("Hitpoints for Creature set at " +  MIN_HP + ", the minimum allowable.");
        }
        else
            hitPoints = hp;
    }

    /**
     * setStrength allows strength to be set
     * @param str The designated hp, which cannot be less than MIN_STR.
     */
    public void setStrength(int str)
    {
        if (str < MIN_STR)
        {
            strength = 5;
            System.out.println("Strength set at " + MIN_STR + ", the minimum allowable.");
        }
        else
            strength = str;
    }

    /**
     * damage is the potential damage the Creature created can inflict up to its strength
     * @return A random number between 1 and strength.
     */
    public int damage(){
        //generate a random number from 1 to strength
        return randomGenerator.nextInt(strength)+ 1;
    }
    /**
     * getHP returns hitPoints
     * @return hitPoints The hitPoints.
     */
    public int getHP()
    {
       return hitPoints;
    }

    /**
     * getStrength allows strength to be set
     * @return strength The strength.
     */
    public int getStrength()
    {
        return strength;
    }
}
