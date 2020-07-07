package main.java.com.makkkkkkkks.shape;

import main.java.com.makkkkkkkks.point.Point2D;

import java.util.ArrayList;
import java.util.Arrays;

public class Triangle extends PlaneShape {
    private Point2D point2Da;
    private Point2D point2Db;
    private Point2D point2Dc;

    public Triangle(Point2D point2Da, Point2D point2Db, Point2D point2Dc) {
        super(new ArrayList<>(Arrays.asList(point2Da, point2Db, point2Dc)));
        this.point2Da = point2Da;
        this.point2Db = point2Db;
        this.point2Dc = point2Dc;
    }

    @Override
    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfPerimeter * ((halfPerimeter - point2Da.calculateDistance(point2Db))
                * (halfPerimeter - point2Db.calculateDistance(point2Dc))
                * (halfPerimeter - point2Dc.calculateDistance(point2Da))));
    }

    @Override
    public double getPerimeter() {
        return point2Da.calculateDistance(point2Db)
                + point2Db.calculateDistance(point2Dc)
                + point2Dc.calculateDistance(point2Da);
    }

    @Override
    public String toString() {
        return "Triangle " +
                " point2Da= " + point2Da + " " +
                " point2Db= " + point2Db + " " +
                " point2Dc= " + point2Dc + " " +
                " perimeter=" + getPerimeter() + " " +
                " area=" + getArea();
    }
}
