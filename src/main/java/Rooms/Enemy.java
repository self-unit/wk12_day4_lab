package Rooms;

import behaviours.IAction;
import items.Weapon;

public class Enemy implements IAction {

    private String type;
    private int health;
    private Weapon weapon;

    public Enemy(String type, int health, Weapon weapon) {
        this.type = type;
        this.health = health;
        this.weapon = weapon;
    }

    public void action(IAction actor){

    }

}
