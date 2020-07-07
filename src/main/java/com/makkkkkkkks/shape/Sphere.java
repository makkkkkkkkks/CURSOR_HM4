package main.java.com.makkkkkkkks.shape;

import main.java.com.makkkkkkkks.point.Point3D;

import java.util.Collections;

public class Sphere extends SpaceShape {
    private double radius;
    private Point3D center;

    public Sphere(Point3D center, double radius) {
        super(Collections.singletonList(center));
        this.radius = radius;
        this.center = center;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Spheren " +
                " center=" + center +
                " radius=" + radius +
                " area=" + getArea() +
                " volume=" + getVolume();
    }
}