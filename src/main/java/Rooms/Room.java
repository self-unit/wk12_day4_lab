package Rooms;

import behaviours.IAction;

import java.util.ArrayList;

public class Room {

    private ArrayList<IAction> actors;
    private Treasure treasure;

    public Room(ArrayList<IAction> actors, Treasure treasure) {
        this.actors = actors;
        this.treasure = treasure;
    }

    public Room(ArrayList<IAction> actors) {
        this.actors = actors;
    }

    public ArrayList<IAction> getActors() {
        return actors;
    }

    public Treasure getTreasure() {
        return treasure;
    }
}
