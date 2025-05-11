package ru.vlsu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import ru.vlsu.ispi.Point;
import ru.vlsu.ispi.PointComparator;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Point> pointList = new ArrayList<>();

        System.out.println("Введите количество точек:");
        int countPoints = in.nextInt();

        System.out.println("Введите координату x и y через пробел:");
        for (int i = 0; i < countPoints; i++){
            System.out.print("Координата " + (i + 1)  + ": ");
            pointList.add(new Point(in.nextInt(), in.nextInt()));
        }

        Collections.sort(pointList, new PointComparator());
        for (Point pointUnit : pointList){
            System.out.println(pointUnit);
        }
    }
}

