package actions;

public abstract class Defence {
    private String name;
    private int defenceValue;

    public Defence(String name, int defenceValue){
        this.name = name;
        this.defenceValue = defenceValue;
    }

    public String getName() {
        return name;
    }

    public int getDefenceValue() {
        return defenceValue;
    }
}
