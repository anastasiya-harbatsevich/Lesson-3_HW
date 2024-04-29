package org.example.homework8.Bedroom;

public class Bedroom {
    String name;

    Wall wall1;

    Wall wall2;

    Wall wall3;

    Wall wall4;

    Ceiling ceiling;

    Bed bed;

    Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;

        this.wall1 = wall1;

        this.wall2 = wall2;

        this.wall3 = wall3;

        this.wall4 = wall4;

        this.ceiling = ceiling;

        this.bed = bed;

        this.lamp = lamp;
    }

    public static void makeBed() {
        Bed.make();
        System.out.println("Bedroom -> start making the bed");
    }

    public Lamp getLamp() {
        return lamp;
    }
}
