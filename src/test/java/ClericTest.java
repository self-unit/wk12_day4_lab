import actions.Heal;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Heal potion;

    @Before
    public void before(){
//        potion = new Heal("green-herb", )
        cleric = new Cleric("Johnny john jon", 14, potion);
    }

    @Test
    public void hasHeal(){
        assertEquals(potion, cleric.getHeal());
    }
}
