package main.java.com.makkkkkkkks.shape;

import main.java.com.makkkkkkkks.point.Point;
import main.java.com.makkkkkkkks.point.Point2D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rectangle extends PlaneShape {
    private Point2D point2D;
    private double width;
    private double height;

    public Rectangle(Point2D point2D, double width, double height) {
        super(new ArrayList<>(Collections.singletonList(point2D)));
        this.point2D = point2D;
        this.width = width;
        this.height = height;
    }

    @Override
    public List<Point> getPoints() {
        return super.getPoints();
    }

    @Override
    public void setPoints(List<Point> points) {
        super.setPoints(points);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle" +
                " point2D=" + point2D +
                ", width=" + width +
                ", height=" + height +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea() +
                '}';
    }
}
