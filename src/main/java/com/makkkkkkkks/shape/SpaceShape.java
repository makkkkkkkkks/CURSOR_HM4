package main.java.com.makkkkkkkks.shape;

import main.java.com.makkkkkkkks.interfaces.AreaMeasurable;
import main.java.com.makkkkkkkks.interfaces.VolumeMeasurable;
import main.java.com.makkkkkkkks.point.Point;

import java.util.List;

public abstract class SpaceShape extends Shape implements VolumeMeasurable, AreaMeasurable {

    public SpaceShape(List<Point> points) {
        super(points);
    }
}