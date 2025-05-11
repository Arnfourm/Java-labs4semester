package com.vlsu.util;

import java.util.Scanner;

public class Circle {

    private float[] centerPoint = new float[2];
    private float Radius;

    public Circle(){
        Scanner in = new Scanner(System.in);

        System.out.println("Круг: введите координаты центра круга (x, y): ");
        centerPoint[0] = in.nextFloat();
        centerPoint[1] = in.nextFloat();

        System.out.println("Круг: введите радиус: ");
        Radius = in.nextFloat();
    }

    public float[] getCenterPoint() {return centerPoint;}
    public float getRadius() {return Radius;}
}