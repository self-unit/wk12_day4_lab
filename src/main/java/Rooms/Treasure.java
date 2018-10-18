package Rooms;

public class Treasure {

    private String type;
    private int value;

    public Treasure(String type, int value){
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public int getValue() {
        return value;
    }
}
