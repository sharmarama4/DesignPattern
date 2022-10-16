package org.prototype;

public abstract class Game implements Cloneable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract void playGame();


    @Override
    protected Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

}
