package players;

import actions.Heal;
import behaviours.IAction;

public class Cleric extends Player implements IAction {

    private Heal heal;

    public Cleric(String name, int health, Heal heal) {
        super(name, health);
        this.heal = heal;
    }

    public void action(IAction actor){

    }

    public Heal getHeal() {
        return heal;
    }
}
