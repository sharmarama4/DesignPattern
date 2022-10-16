package org.prototype;

public class Ludo extends Game{
    @Override
    public String toString() {
        return "Ludo{" +
                "name='" + getName() + '\'' +
                "} " ;
    }

    @Override
    public void playGame() {
        System.out.println("Play ludo game");
        System.out.println("max 4-players");

    }
}
