package ru.job4j.oop;

public class Student {
    public void music() {
        System.out.println("Tra tra tra");
    }

    public void sing() {
        System.out.println("La la la");
    }
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.sing();
        petya.music();
        petya.sing();
        petya.music();
        petya.sing();
    }
}