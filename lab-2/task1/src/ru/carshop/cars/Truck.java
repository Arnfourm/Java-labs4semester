package ru.carshop.cars;

public class Truck extends Car {
    int weight;

    public Truck(int speed, boolean isSeelOut, int regularPrice, String color, int weight) {
        super(speed, isSeelOut, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000){
            return regularPrice * 0.9;
        }
        return regularPrice;
    }
}
