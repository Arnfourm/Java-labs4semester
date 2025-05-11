package ru.vlsu.ispi;

public class Point {
    private final int xOrd;
    private final int yOrd;

    public Point(int xOrd, int yOrd){
        this.xOrd = xOrd;
        this.yOrd = yOrd;
    }

    public Integer getXOrd(){ return xOrd; }
    public Integer getYOrd(){ return yOrd; }

    public String toString() { return xOrd + " " + yOrd; }
}
