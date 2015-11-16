
/**
 * Elf is a Creature ubtype
 * 
 * @author Maria Langman 
 * @version 2015.11.15
 */
public class Elf extends Creature
{
    /**
     * Constructor for object of class Elf has characteristics of Creature, so must call the super method.
     */
    public Elf()
    {
        super();
    }

    /**
     * damage method for Elf has a 10% chance to do magical damage, to return 2x the damage
     * 
     * @return inheritedDamage (or 2*inheritedDamage, given 10% probability is fulfilled).
     */
    public int damage()
    {
        int chance = super.randomGenerator.nextInt(10);   //generates a set of numbers [0 to 9]
        int inheritedDamage = super.damage();          
        //System.out.println("Chance is: " + chance);    //used to assert
        if (chance == 0)  //any number from the sample space has a p(x=X), so choose any number as conditional
        {
            System.out.println("Original damage: " + inheritedDamage);  //used for testin
            return 2*inheritedDamage;
        }
        else
        {
            return inheritedDamage;
        }
    }
}
