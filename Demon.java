
/**
 * Demon is Creature subtype.
 * 
 * @author Maria Langman 
 * @version 2015.11.15
 */
public class Demon extends Creature
{
    /**
     * Constructor for object of class Demon has characteristics of Creature, so must call the super method.
     * Demon type has a 5% chance to do magical damage, which is 50 + damage inherited from Creature.
     */
    public Demon()
    {
       super();
    }
    public Demon(int hp, int str)
    {
       super(hp, str);
    }
    /**
     * getDamage method for Demon overrides Creature's method, since Demon object has a 5% chance 
     * to do magical damage, to return damage + 50.  chance generates a number from a set [0 to 19].
     * If X=event of any number from the sample space then p(X=x); so choose any number as conditional.
     * 
     * @return inheritedDamage (or inheritedDamage + 50, given 5% probability is fulfilled). 
     */
    public int getDamage()
    {
        int chance = super.randomGenerator.nextInt(20);   //generates a set of numbers [0 to 19]
        int inheritedDamage = super.getDamage();          
        //System.out.println("Chance is: " + chance);    //used for testing
        if (chance == 0)  //any number from the sample space has a p(X=x), so choose any number as conditional
        {
            //System.out.println("Original damage: " + inheritedDamage);  //used for testing
            return inheritedDamage + 50;
        }
        else
        {
            return inheritedDamage;
        }
    }
}
