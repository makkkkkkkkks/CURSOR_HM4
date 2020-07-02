package shape;

import geometryInterface.AreaMeasurable;
import geometryInterface.PerimeterMeasurable;
import point.Point;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    public PlaneShape(List<Point> points) {
        super(points);
    }
}