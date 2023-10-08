package com.company;
import java.awt.*;
public class Circle {
    Point center;
    double radius;
    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }
    public double distance1(Point point){
        return Math.sqrt(Math.pow(center.x- point.x,2)+Math.pow(center.y-point.y,2));
    }
    public boolean PointInsideCircle(Point point){
        if (distance1(point)<radius){
            return true;
        } else return false;
    }
}
