package ru.job4j.oop.abstarct;

public class FootballPlayer extends Sportsman {
    @Override
    void run() {
        System.out.println("Средняя скорость бега.");
    }

    public void footKik() {
        System.out.println("Удар ногой по мячу.");
    }
}
