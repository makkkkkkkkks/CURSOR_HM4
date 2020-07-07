package main.java.com.makkkkkkkks.shape;

import main.java.com.makkkkkkkks.interfaces.AreaMeasurable;
import main.java.com.makkkkkkkks.interfaces.PerimeterMeasurable;
import main.java.com.makkkkkkkks.point.Point;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    public PlaneShape(List<Point> points) {
        super(points);
    }
}