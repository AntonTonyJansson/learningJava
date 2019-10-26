package com.company;

public class Table {
    int legs;
    double height;
    String color;
    String material;
    int number_of_guests;
    int table_number;
    boolean exists = true;

    public Table(int legs, double height, String color,
                 String material, int number_of_guests, int table_number)
    {
        this.legs = legs;
        this.height = height;
        this.color = color;
        this.material = material;
        this.number_of_guests = number_of_guests;
        this.table_number = table_number;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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

    public int getNumber_of_guests() {
        return number_of_guests;
    }

    public void setNumber_of_guests(int number_of_guests) {
        this.number_of_guests = number_of_guests;
    }
    public int getTable_number() {
        return table_number;
    }

    public void setTable_number(int table_number) {
        this.table_number = table_number;
    }


}
