package ru.job4j.oop.saga;

public class Saga {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        RedHatGirl girl = new RedHatGirl();
        Wolf wolf = new Wolf();
        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}
