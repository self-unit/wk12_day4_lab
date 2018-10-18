package Rooms;

import behaviours.IAction;

import java.util.LinkedList;

public class Room {

    private LinkedList<IAction> actors;
    private Treasure treasure;

    public Room(LinkedList<IAction> actors, Treasure treasure) {
        this.actors = actors;
        this.treasure = treasure;
    }

    public Room(LinkedList<IAction> actors) {
        this.actors = actors;
    }

}
