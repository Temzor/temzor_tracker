package ru.job4j.oop;

public class Calculator {
    private final static int X = 5;

    public static int sum(int y) {
        return X + y;
    }

    public int multiply(int y) {
        return X * y;
    }
    public int divide(int y) {
        return y / X;
    }
    public static int minus(int y) {
        return X - y;
    }
    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + divide(y) + minus(y);
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(sum(10));
        System.out.println(minus(10));
        System.out.println(calculator.multiply(5));
        System.out.println(calculator.divide(50));
        System.out.println(calculator.sumAllOperation(44));
    }
}
