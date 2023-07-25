package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Не известное слово: " + eng;
    }

    public static void main(String[] args) {
        DummyDic dicEngToRus = new DummyDic();
        System.out.println(dicEngToRus.engToRus("Wow"));
    }
}
