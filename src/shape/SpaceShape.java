package shape;

import geometryInterface.AreaMeasurable;
import geometryInterface.VolumeMeasurable;
import point.Point;

import java.util.List;

public abstract class SpaceShape extends Shape implements VolumeMeasurable, AreaMeasurable {

    public SpaceShape(List<Point> points) {
        super(points);
    }
}