package ru.job4j.oop;

public class Student {
    public void music(String lyrics) {
        System.out.println("I can play a music " + lyrics);
    }

    public void sing(String song) {
        System.out.println("I can sing a song " + song);
    }

    public static void main(String[] args) {
        Student petya = new Student();
        Student vasya = new Student();
        vasya.music("Tra tra tra");
        petya.music("Bra bra bra");
        vasya.sing("La la la");
        petya.sing("Tu lu la");
    }
}
