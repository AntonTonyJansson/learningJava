package com.company;

public class Chair {
    int legs;
    String color;
    String material;

    public Chair(int legs, String color, String material)
    {
        this.legs = legs;
        this.color = color;
        this.material = material;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

}
