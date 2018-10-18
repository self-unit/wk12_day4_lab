package players;

import actions.Heal;
import behaviours.IAction;

public class Cleric extends Player implements IAction {

    private Heal heal;

    public Cleric(String name, int health, Heal heal) {
        super(name, health);
        this.heal = heal;
    }

    @Override
    public void action(IAction actor){
        ((Player) actor).addHealth(heal.getHealingValue());
        this.addHealth(heal.getHealingValue());
    }

    public Heal getHeal() {
        return heal;
    }

    public void setHeal(Heal healingItem) {
        this.heal = healingItem;
    }
}
