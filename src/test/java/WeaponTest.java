import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    Weapon sword;

    @Before
    public void before() {
        sword = new Weapon("sword", 10);
    }

    @Test
    public void hasName() {
        assertEquals("sword", sword.getName());
    }

    @Test
    public void hasDamage() {
        assertEquals(10, sword.getDamage());
    }
}
