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
        int numBeatles = 6;
        int numByrds = 6;
        System.out.print("Beatles Elf");
        System.out.println("\tHitpoints \tStrength");
        for (int i = 0; i < numBeatles/2; i++)
        {
            int hp = randomGenerator.nextInt(20);       
            int str = randomGenerator.nextInt(20);
            beatles.add(new Elf(hp, str));
            System.out.println("\t\t" + beatles.get(i).getHP() + "\t\t" + beatles.get(i).getStrength());

        }
        //second set of members of the beatles will be of Human type with apt restrictions
        //min strength and hitPoints at 5; max HP at 30; max strength at 18
        System.out.print("Beatles Human\n");
        for (int i= numBeatles/2; i < numBeatles; i++)
        {
            int hp = randomGenerator.nextInt(31);       
            int str = randomGenerator.nextInt(19);
            beatles.add(new Human(hp, str));
            System.out.println("\t\t" + beatles.get(i).getHP()+"\t\t" + beatles.get(i).getStrength());

        }
        System.out.print("Byrds Demon\n");
        for (int i = 0; i < numByrds/2; i++)
        {
            int hp = randomGenerator.nextInt(20);       
            int str = randomGenerator.nextInt(20);
            byrds.add(new Demon(hp, str));
            System.out.println("\t\t" + byrds.get(i).getHP()+"\t\t" + byrds.get(i).getStrength());

        }
        System.out.print("Byrds Balrog\n");
        for (int i = numByrds/2; i < numByrds; i++)
        {
            int hp = randomGenerator.nextInt(20);       
            int str = randomGenerator.nextInt(20);
            byrds.add(new Balrog(hp, str));
            System.out.println("\t\t" + byrds.get(i).getHP()+"\t\t" + byrds.get(i).getStrength());

        }
    }

    private void battle()
    {
        int i = 0;  //beatles index
        int y = 0;  //byrds index
        boolean warIsOn = true;
        int byrdAssault;
        int beatleAssault;
        System.out.println("The War Statistics: Fighter ID in [ ]");
        System.out.println("Beatles:HP-Damage\tHP\tByrds:HP-Damage\tHP");
        while (warIsOn && (beatles.get(i).getHP() > 0 && byrds.get(y).getHP() > 0))
        {
            byrdAssault = byrds.get(y).getDamage();     //damage that this calling byrds fighter can do
            System.out.print("\t" + beatles.get(i).getHP());    //for testing
            System.out.print("-" + byrdAssault );    //for testing
            
            beatles.get(i).takeWound(byrdAssault);      //beatles fighter 

            System.out.print("\t\t" + beatles.get(i).getHP()+"[" + i +"]");    //for testing

            System.out.print("\t\t" + byrds.get(y).getHP());    //for testing
            beatleAssault = beatles.get(i).getDamage();
            System.out.print("-" + beatleAssault);    //for testing
            byrds.get(y).takeWound(beatleAssault);
            System.out.println("\t" + byrds.get(y).getHP()+"[" + y +"]");    //for testing
            //At this stage of the design byrds can be of Balrog type.  Attack again.
            if (y < byrds.size() && byrds.get(y) instanceof Balrog)
            {
                //Check if current beatles is not dead. If dead attack the next beatles, if next one exists
                if (beatles.get(i).getHP() <= 0)
                {    i++;
                    if ( i < beatles.size())
                    {
                        System.out.println("Balrog attacks again");   //for testing
                        byrdAssault = byrds.get(y).getDamage();
                        System.out.print("\t" + beatles.get(i).getHP());    //for testing
                        System.out.print("-" + byrdAssault );    //for testing
                        beatles.get(i).takeWound(byrdAssault);
                        System.out.println("\t\t" + beatles.get(i).getHP()+"[" + i +"]");    //for testing
                    }
                }
            }
            if (i < beatles.size() && y < byrds.size())
            {
                if (beatles.get(i).getHP() <= 0)
                    i++;
                if (byrds.get(y).getHP() <= 0)
                    y++;
            }
            //check if a band is out of fighters
            if (i == beatles.size() || y == byrds.size())
                warIsOn = false;
        }

        if (i == y)
            System.out.println("No winners");
        if (i < y)
            System.out.println("The Beatles won with " +(beatles.size()- i) + " member(s) alive.");
        if (i > y)
            System.out.println("The Byrds won with " + (byrds.size()- y) + " member(s) alive.");
    }
}
