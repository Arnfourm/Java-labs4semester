package ru.carshop.Interface;

import ru.carshop.cars.Car;

public interface Customer {
    double[] getCarsPrice();
    String[] getCarsColors();
    double getCarPrice(int id);
    String getCarColor(int id);
    Car purchaseCar(int id);
}
