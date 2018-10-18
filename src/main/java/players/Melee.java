package players;

import items.Weapon;
import behaviours.IAction;

public abstract class Melee extends Player implements IAction {

    private Weapon weapon;

    public Melee(String name, int health, Weapon weapon){
        super(name, health);
        this.weapon = weapon;
    }

    public void action(IAction actor) {

    }
}
