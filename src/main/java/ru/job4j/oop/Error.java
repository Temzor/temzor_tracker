package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    private void printInfo() {
        System.out.println("Active is: " + active);
        System.out.println("Status is: " + status);
        System.out.println("Message is contain: " + message);
    }

    public static void main(String[] args) {
        Error first = new Error();
        first.printInfo();
        Error second = new Error(true, 500, "NPE");
        second.printInfo();
    }
}
