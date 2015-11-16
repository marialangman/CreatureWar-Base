

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CreatureTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CreatureTest
{
    /**
     * Default constructor for test class CreatureTest
     */
    public CreatureTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testHP()
    {
        Creature creature1 = new Creature();
        creature1.setHP(5);
        creature1.setHP(4);
    }
}

