package com.company;

import java.text.MessageFormat;

public class Main {

    int available;
    public static void main(String[] args)
    {
        Table TableTwelve = new Table(4, 179.5, "Brown", "Wood",
                6, 12);
        Chair ChairOne = new Chair(4, "Brown", "Wood");
        TableGroup TableGroupTwelve = new TableGroup(TableTwelve, ChairOne);
        System.out.println(TableTwelve.getNumber_of_guests());
        TableTwelve.setNumber_of_guests(8);
        System.out.println(TableTwelve.getNumber_of_guests());
        System.out.println("Table group number is " + TableGroupTwelve.getGroup_number() + '.');
        System.out.println(MessageFormat.format("Table group number is: {0}.",
                TableGroupTwelve.getGroup_number()));
        byte t1= 2;
        byte t2 = t1;
        System.out.println(MessageFormat.format("Example: t1: {0}, t2: {1}",t1, t2));
        t1 = 3;
        System.out.println(MessageFormat.format("Example: t1: {0}, t2: {1}",t1, t2));
        this.setAvailable(1, true);
    }
    public void setAvailable(int button, boolean a){
        int button1 = 1;
        //System.out.println(Integer.toBinaryString(button1));
        //System.out.println(Integer.toBinaryString(1<<button1));
        available |= (1<<button1);
        System.out.println(Integer.toBinaryString(available));
        int button2 = 2;
        //System.out.println(Integer.toBinaryString(button2));
        //System.out.println(Integer.toBinaryString(1<<button2));
        available |= (1<<button2);
        System.out.println(Integer.toBinaryString(available));
        System.out.println(available);
    }
}