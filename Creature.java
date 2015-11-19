import java.util.Random;
/**
 * Creature class is a a superclass that has default hitpoints and strength set at initialization.
 * Other subtypes will inherit from this superclass.
 * 
 * @author Maria Langman 
 * @version 2015.11.18
 */
public class Creature
{
    private int hitPoints;
    private int strength;
    private int damage;
    private final int MIN_HP = 5;
    private final int MIN_STR = 5;
    protected Random randomGenerator;   //to be shared by Creature types and subtypes

    /**
     * No-arg Constructor for a Creature object default values for hitpoints and strength to 10 each.
     */
    public Creature(){
        hitPoints = 10;
        strength = 10;
        randomGenerator = new Random();     //create the Random object for all to use
        damage = randomGenerator.nextInt(strength)+1;
    }
    
    /**
     * Constructor for a Creature object with parameters hp and str to initialize hitPoints and strength.
     * but makes sure the values are within range of minimum values by calling setHP and setStrength methods
     * @param hp An int to assign to hitPoints, which will be validated as per spec
     * @param str An int to assign to strength, which will be validated as per spec
     */
    public Creature(int hp, int str){
        setHP(hp);      //makes hitPoints assignment to be within range
        setStrength(str);   //makes strength assignment to be within range
        randomGenerator = new Random();     //create the Random object for all to use
        damage = randomGenerator.nextInt(strength)+1;
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
           // System.out.println("Hitpoints set at " +  MIN_HP + ", the minimum allowable.");     //for testing
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
            //System.out.println("Strength set at " + MIN_STR + ", the minimum allowable.");  //for testing
        }
        else
            strength = str;
    }
    /**
     * setDamage method sets the damage
     */
    public void setDamage(int damage)
    {
        this.damage = damage;
    }

    /**
     * getDamage is the potential damage the Creature can inflict up to its strength
     * @return damage Potential damage the Creature can inflict
     */
    public int getDamage(){
        //generate a random number from 1 to strength
        return damage;
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
     * getStrength returns strength
     * @return strength The strength
     */
    public int getStrength()
    {
        return strength;
    }
    /**
     * takeWound method passes an int injury to update hitPoints based on injury
     * Note: if updated hitPoints <= 0 then injury is fatal
     * @param injury The injury done unto calling Creature by enemy.
     */
    public void takeWound(int injury)
    {
        hitPoints = hitPoints - injury;
    }
}
