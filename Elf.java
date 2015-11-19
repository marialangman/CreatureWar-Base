
/**
 * Elf is a Creature subtype
 * 
 * @author Maria Langman 
 * @version 2015.11.15
 */
public class Elf extends Creature
{
    /**
     * No-arg Constructor for object of class Elf has characteristics of Creature, so must call the super method.
     */
    public Elf()
    {
        super();
        super.setDamage(magicalDamage());
    }
    /**
     * Constructor with parameters hp and str
     */
    public Elf(int hp, int str)
    {
        super(hp, str);
        super.setDamage(magicalDamage());
    }
    /**
     * magicalDamage method for Elf has a 10% chance to do magical damage, to return 2x the damage
     * chance generates a number from a set  [0 to 10]
     * If X=event of any number from the sample space then p(X=x), so choose any number as conditional
     * 
     * @return inheritedDamage (or 2*inheritedDamage, given 10% probability is fulfilled).
     */
    public int magicalDamage()
    {
        int chance = super.randomGenerator.nextInt(10);   
        int inheritedDamage = super.getDamage();          
        //System.out.println("Chance is: " + chance);    //used to assert
        if (chance == 0)  //any number from the sample space has a p(X=x), so choose any number as conditional
        {
            //System.out.println("Original damage: " + inheritedDamage);  //used for testing
            return 2*inheritedDamage;
        }
        else
        {
            return inheritedDamage;
        }
    }
}
