import Rooms.Enemy;
import Rooms.Treasure;
import actions.Heal;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Cleric;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Cleric cleric;
    Heal potion;
    Heal herb;
    Barbarian barbarian;
    Weapon sword;
    Treasure gold;
    Enemy enemy;

    @Before
    public void before(){
        sword = new Weapon("Sword", 100);
        barbarian = new Barbarian("Gargleface", 300, sword);
        potion = new Heal("stank-sauce", 10);
        herb = new Heal("red-herb", 40);
        gold = new Treasure("gold", 100);
        cleric = new Cleric("Johnny john jon", 14, potion);
        enemy = new Enemy("skank", 100, sword);
    }

    @Test
    public void canDamagePlayer(){
        enemy.action(barbarian);
        assertEquals(200, barbarian.getHealth());
    }
}
