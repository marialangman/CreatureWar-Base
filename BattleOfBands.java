import java.util.ArrayList;
import java.util.Random;
/**
 * This simulates a battle between two bands of Creature type
 * 
 * @author Maria Langman 
 * @version 2015.11.18
 */
public class BattleOfBands
{
    private ArrayList<Creature> beatles;
    private ArrayList<Creature> byrds;
    private Random randomGenerator;
    /**
     * Constructor for objects of class BattleOfBands
     */
    public BattleOfBands()
    {
        beatles = new ArrayList<Creature>();
        byrds = new ArrayList<Creature>();
        randomGenerator = new Random();
        setUpBands();
        battle();
    }

    private void setUpBands()
    {
        //Randomly generate the hitPoints and strength for the members
        //only restrictions for Elf is min hitPoints and min strength of 5
        //half of members of the beatles will be of Elf type
        System.out.print("Beatles Elf");
        System.out.println("\tHitpoints \tDamage");
        for (int i = 0; i < 2; i++)
        {
            int hp = randomGenerator.nextInt(20);       
            int str = randomGenerator.nextInt(20);
            beatles.add(new Elf(hp, str));
            System.out.println("\t\t"+beatles.get(i).getHP() + "\t\t" + beatles.get(i).getDamage());

        }
        //second set of members of the beatles will be of Human type with apt restrictions
        //min strength and hitPoints at 5; max HP at 30; max strength at 18
        System.out.println("Beatles Human");
        for (int i = 2; i < 4; i++)
        {
            int hp = randomGenerator.nextInt(31);       
            int str = randomGenerator.nextInt(19);
            beatles.add(new Human(hp, str));
            System.out.println("\t\t" + beatles.get(i).getHP()+"\t\t" + beatles.get(i).getDamage());

        }
        System.out.println("Byrds Demon");
        for (int i = 0; i < 4; i++)
        {
            int hp = randomGenerator.nextInt(20);       
            int str = randomGenerator.nextInt(20);
            byrds.add(new Demon(hp, str));
            System.out.println("\t\t" + byrds.get(i).getHP()+"\t\t" + byrds.get(i).getDamage());
    
        }
    }
    private void battle()
    {
        int i = 0;
        int y = 0;
        boolean warIsOn = true;
        System.out.println("The War");
        System.out.println("Beatles:HP-Damage\tHP\tByrds:HP-Damage\tHP");
        while (warIsOn && (beatles.get(i).getHP() > 0 && byrds.get(y).getHP() > 0))
        {
            System.out.print("\t" + beatles.get(i).getHP());    //for testing
            System.out.print("-" + byrds.get(y).getDamage());    //for testing
            beatles.get(i).takeWound(byrds.get(y).getDamage());
            System.out.print("\t\t" + beatles.get(i).getHP());    //for testing
            
            System.out.print("\t\t" + byrds.get(y).getHP());    //for testing
            System.out.print("-" + beatles.get(i).getDamage());    //for testing
            byrds.get(y).takeWound(beatles.get(i).getDamage());
            System.out.println("\t" + byrds.get(y).getHP());    //for testing
            if (beatles.get(i).getHP() <= 0)
                i++;
            if (byrds.get(y).getHP() <= 0)
                y++;
            if (i == beatles.size()  || y == byrds.size())
                warIsOn = false;
        }
        System.out.println("i: " + i + "\ty: " + y);
        if (i == y)
            System.out.println("No winners");
        if (i < y)
            System.out.println("The Beatles won with " +(4- i) + " member(s) alive.");
        if (i > y)
            System.out.println("The Byrds won with " + (4- y) + " member(s) alive.");
    }
}