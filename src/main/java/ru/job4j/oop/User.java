package ru.job4j.oop;

public class User {
    private String name;
    private int age;

    public boolean canDrive() {
        return age >= 18;
    }
}
