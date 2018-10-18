import items.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Knight;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    Knight knight;
    Weapon weapon;
    @Before
    public void before(){
        weapon = new Weapon("Sword", 10);
        knight = new Knight("Dark Knight", 50, weapon);
    }

    @Test
    public void hasName(){
        assertEquals("Dark Knight", knight.get)
    }
}
