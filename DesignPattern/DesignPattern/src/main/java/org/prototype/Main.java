package org.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        GameRegistry registry=new GameRegistry();//without new keyword create objects the main purpose of this design pattern
        Ludo ludo=(Ludo)registry.getGame(GameType.LUDO);
        System.out.println(ludo);
        ludo.setName("xyz");

        Ludo ludo2=(Ludo)registry.getGame(GameType.LUDO);
        System.out.println(ludo2);
        System.out.println("----");
        System.out.println(ludo);
        System.out.println(ludo2);
    }
}
