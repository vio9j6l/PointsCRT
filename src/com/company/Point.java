package com.company;

public class Point {
    private double x;
    private double y;
    private double z;

    public Point(double _x, double _y, double _z) {
        this.x= _x;
        this.y = _y;
        this.z = _z;
    }

    public Point(double _x, double _y) {
        this.x= _x;
        this.y = _y;
    }

    public Double getX() {return x;}
    public void setX(double _x) {this.x = _x;}

    public double getY() {return y;}
    public void setY(double _y) {this.y = _y;}

    public double getZ() {return z;}
    public void setZ(double _z) {this.z = _z;}
}
