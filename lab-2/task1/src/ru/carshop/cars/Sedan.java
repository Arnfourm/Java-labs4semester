package ru.carshop.cars;

public class Sedan extends Car{
    int length;

    public Sedan(int speed, boolean isSeelOut, int regularPrice, String color, int length) {
        super(speed, isSeelOut, regularPrice, color);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if (length > 20){
            return regularPrice * 0.95;
        }
        return regularPrice;
    }
}
