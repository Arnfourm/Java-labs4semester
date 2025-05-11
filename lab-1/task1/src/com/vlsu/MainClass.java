package com.vlsu;

import com.vlsu.util.Circle;
import com.vlsu.util.pointCircle;

public class MainClass {
    public static void main(String [] args){
        Circle circle = new Circle();

        float[] centerPoint = circle.getCenterPoint();
        float radius = circle.getRadius();

        System.out.println("Круг: координаты центральной точки - (" + centerPoint[0] + ", " + centerPoint[1] + "), " +
                "радиус - " + radius);

        float[] point = pointCircle.readPoint();
        System.out.println("Точка: координаты точки - (" + point[0] + ", " + point[1] + ")");

        System.out.print("\nОтвет: ");
        boolean pointIn = inside(centerPoint, radius, point);
        if (pointIn) {
            System.out.println("точка находится внутри круга");
        } else {
            System.out.println("точка не находится внутри круга");
        }
    }

    private static boolean inside(float[] centerPoint, float radius, float[] point){
        if ((Math.pow(point[0] - centerPoint[0], 2) + Math.pow(point[1] - centerPoint[1], 2)) <= Math.pow(radius, 2)){
            return true;
        }
        return false;
    }
}