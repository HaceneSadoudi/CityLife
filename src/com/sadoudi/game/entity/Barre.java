package com.sadoudi.game.entity;

public class Barre {

    private BarreType type;
    private static final int maxBarre = 100;
    private int value;

    public BarreType getType() {
        return type;
    }

    public int getMaxBarre() {
        return maxBarre;
    }

    public int getValue() {
        return value;
    }

    public void setType(BarreType type) {
        this.type = type;
    }


    public void setValue(int value) {
        this.value = value;
    }
}
