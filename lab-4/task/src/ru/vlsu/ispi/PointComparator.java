package ru.vlsu.ispi;

import java.util.Comparator;

public class PointComparator implements Comparator {
    @Override
    public int compare(Object point1, Object point2){
        Point pointFirst = (Point) point1;
        Point pointSecond = (Point) point2;

        int result = pointFirst.getXOrd().compareTo(pointSecond.getXOrd());
        if (result != 0){
            return result;
        }
        return pointFirst.getYOrd().compareTo(pointSecond.getYOrd());
    }
}
