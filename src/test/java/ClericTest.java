import Rooms.Treasure;
import actions.Heal;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Cleric;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Heal potion;
    Heal herb;
    Barbarian barbarian;
    Weapon sword;
    Treasure gold;

    @Before
    public void before(){
        barbarian = new Barbarian("Gargleface", 300, sword);
        potion = new Heal("stank-sauce", 10);
        herb = new Heal("red-herb", 40);
        gold = new Treasure("gold", 100);
        cleric = new Cleric("Johnny john jon", 14, potion);
    }

    @Test
    public void hasHeal(){
        assertEquals(potion, cleric.getHeal());
    }

    @Test
    public void canHeal(){
        cleric.action(barbarian);
        assertEquals(310, barbarian.getHealth());
    }

    @Test
    public void canChangeHealing(){
        cleric.setHeal(herb);
        assertEquals(herb, cleric.getHeal());
    }

    @Test
    public void canAddCoins(){
        cleric.addCoins(gold.getValue());
        assertEquals(100, cleric.getCoins());
    }
}
