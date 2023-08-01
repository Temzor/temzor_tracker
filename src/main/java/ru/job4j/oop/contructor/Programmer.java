package ru.job4j.oop.contructor;

public class Programmer extends Engineer {
    private String programLand;

    public Programmer(boolean degree, int experience, String programLand) {
        super(degree, experience);
        this.programLand = programLand;
    }
}
