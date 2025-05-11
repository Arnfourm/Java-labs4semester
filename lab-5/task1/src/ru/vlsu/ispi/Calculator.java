package ru.vlsu.ispi;

public class Calculator {
    private static final int radius = 1;

    public static double calculator(int countPoints){
        int pointsIn = 0;

        for (int i = 0; i < countPoints; i++){
            double x = Math.random() * (radius * 2) - 1;
            double y = Math.random() * (radius * 2) - 1;

            if (Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(radius, 2)){
                pointsIn++;
            }
        }

        return (4.0 * pointsIn) / countPoints;
    }
}
