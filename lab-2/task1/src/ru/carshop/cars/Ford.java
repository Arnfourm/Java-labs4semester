package ru.carshop.cars;

public class Ford extends Car{
    int year;
    double manufacturerDiscount;

    public Ford(int speed, boolean isSeelOut, int regularPrice, String color, int year, double manufacturerDiscount) {
        super(speed, isSeelOut, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return regularPrice - (regularPrice * manufacturerDiscount);
    }
}
