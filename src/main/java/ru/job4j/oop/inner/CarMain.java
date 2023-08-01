package ru.job4j.oop.inner;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Марка", "Модель");
        Car.Transmission transmission = car.new Transmission();
        Car.Brake brake = car.new Brake();
        Car.TripComputer tripComputer = car.new TripComputer();
        car.startEngine();
        transmission.accelerate();
        brake.accelerate();
        tripComputer.getInfo();
    }
}
