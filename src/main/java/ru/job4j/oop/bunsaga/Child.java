package ru.job4j.oop.bunsaga;

public class Child extends Parent {
    private String patronymic;

    public Child(String name, int age, String patronymic) {
        super(name, age);
        this.patronymic = patronymic;
    }
}
