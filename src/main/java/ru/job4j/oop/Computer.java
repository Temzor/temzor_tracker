package ru.job4j.oop;

public class Computer {
    private String nameComputer;
    private int countMonitor;
    private boolean typeComputer;

    public Computer() {

    }

    public Computer(String nameComputer, int countMonitor, boolean typeComputer) {
        this.nameComputer = nameComputer;
        this.countMonitor = countMonitor;
        this.typeComputer = typeComputer;
    }

    public void printInfo() {
        System.out.println("Name computer is: " + nameComputer);
        System.out.println("Count monitor: " + countMonitor);
        System.out.println("It's laptop: " + typeComputer);
    }

    public static void main(String[] args) {
        Computer computer = new Computer("AMD R8", 5, true);
        computer.printInfo();
        Computer secondComputer = new Computer();
        secondComputer.printInfo();
    }
}

