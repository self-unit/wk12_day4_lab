import Rooms.Treasure;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureTest {

    Treasure treasure1;
    Treasure treasure2;
    Treasure treasure3;

    @Before
    public void before() {
        treasure1 = new Treasure("Gem", 100);
        treasure2 = new Treasure("Gold", 200);
        treasure3 = new Treasure("Crown", 500);
    }

    @Test
    public void hasType() {
        assertEquals("Gem", treasure1.getType());
    }

    @Test
    public void hasValue() {
        assertEquals(500, treasure3.getValue());
    }
}
