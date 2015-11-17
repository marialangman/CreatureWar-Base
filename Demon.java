
/**
 * Demon is Creature subtype.
 * 
 * @author Maria Langman 
 * @version 2015.11.15
 */
public class Demon extends Creature
{
    //inherits from Creature
    /**
     * Constructor for object of class Demon has characteristics of Creature, so must call the super method.
     */
    public Demon()
    {
       super();
    }

    /**
     * damage method for Demon has a 5% chance to do magical damage, to return damage + 50.
     * @return inheritedDamage (or inheritedDamage + 50, given 5% probability is fulfilled). 
     */
    public int damage()
    {
        int chance = super.randomGenerator.nextInt(20);   //generates a set of numbers [0 to 19]
        int inheritedDamage = super.damage();          
        System.out.println("Chance is: " + chance);    //used to assert
        if (chance == 0)  //any number from the sample space has a p(X=x), so choose any number as conditional
        {
            System.out.println("Original damage: " + inheritedDamage);  //used for testing
            return inheritedDamage + 50;
        }
        else
        {
            return inheritedDamage;
        }
    }
}
