package ru.job4j.oop.bunsaga;

public class StartSaga {
    public static void main(String[] args) {
        Bun bun = new Bun();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        hare.tryEat(bun);
        wolf.tryEat(bun);
        fox.tryEat(bun);
    }
}
