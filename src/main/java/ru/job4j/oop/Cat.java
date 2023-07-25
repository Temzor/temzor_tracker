package ru.job4j.oop;

public class Cat {
    public String sound() {
        return "meow-meow";
    }
    public static void main(String[] args) {
        Cat peppy = new Cat();
        Cat sparky = new Cat();
        System.out.println("Peppy says "  + peppy.sound());
        System.out.println("Sparky says "  + sparky.sound());
    }
}