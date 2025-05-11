package ru.carshop.impl;

import ru.carshop.cars.*;
import ru.carshop.Interface.*;

import java.util.ArrayList;

public class MyOwnAutoShop implements Admin, Customer{

    private ArrayList<Car> cars;
    private double allValue = 0;

    public MyOwnAutoShop(){
        cars = new ArrayList<>();

        cars.add(new Sedan(125, false, 14000, "White", 200));
        cars.add(new Ford(250, false, 25000, "Black", 2022, 0.15));
        cars.add(new Ford(200, false, 30000, "Red", 2025, 0.15));
        cars.add(new Truck(375, false, 22500, "Black", 2000));
        cars.add(new Truck(300, false, 50000, "Purple", 3000));
    }

    @Override
    public double getIncome()
    {
        return allValue;
    }

    @Override
    public double[] getCarsPrice() {
        double[] priceList = new double[cars.size()];
        for (int i = 0; i < cars.size(); i++){
            priceList[i] = cars.get(i).getSalePrice();
        }
        return priceList;
    }

    @Override
    public String[] getCarsColors() {
        String[] colors = new String[cars.size()];
        for (int i = 0; i < cars.size(); i++){
            colors[i] = cars.get(i).color;
        }
        return colors;
    }

    @Override
    public double getCarPrice(int id) {
        return cars.get(id).getSalePrice();
    }

    @Override
    public String getCarColor(int id) {
        return cars.get(id).color;
    }

    @Override
    public Car purchaseCar(int id) {
        Car itemCar = cars.get(id);
        cars.remove(id);
        allValue += itemCar.getSalePrice();
        return itemCar;
    }
}
