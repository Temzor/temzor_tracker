package ru.job4j.oop.contructor;

public class Engineer extends Profession {
    private int experience;

    public Engineer(boolean degree, int experience) {
        super(degree);
        this.experience = experience;
    }
}
