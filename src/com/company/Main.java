package com.company;
//encapsulation

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point center = new Point(10,12);
        Point p = new Point(10,15);
        double radius = 5;
        Circle c = new Circle(center,radius);
        System.out.println(c.distance1(p));

        if (c.PointInsideCircle(p)) {
            System.out.println("Point is inside the Circle");
        } else System.out.println("Outside the circle");
    }
}
