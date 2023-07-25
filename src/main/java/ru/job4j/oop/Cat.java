package ru.job4j.oop;

public class Cat {
    public void show(String name, String food) {
        System.out.println("My nick is: " + name + " it's eat: " + food);
    }
    public static void main(String[] args) {
        Cat gav = new Cat();
        Cat black = new Cat();
        gav.show("Gav", "stake");
        black.show("Black", "fish");

    }
}