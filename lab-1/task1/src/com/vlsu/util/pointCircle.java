package com.vlsu.util;

import java.util.Scanner;

public class pointCircle {
    public static float[] readPoint(){
        Scanner in = new Scanner(System.in);

        System.out.println("\nВведите координаты точки (x, y): ");
        return new float[] {in.nextFloat(), in.nextFloat()};
    }
}