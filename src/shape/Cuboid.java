package shape;

import geometryInterface.AreaMeasurable;
import geometryInterface.VolumeMeasurable;
import point.Point;
import point.Point3D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cuboid extends Shape implements AreaMeasurable, VolumeMeasurable {
    private Point3D point3D;
    private double width;
    private double height;
    private double depth;

    public Cuboid(Point3D point3D, double width, double height, double depth) {
        super(new ArrayList<>(Collections.emptyList()));
        this.point3D = point3D;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Cuboid(List<Point> points) {
        super(points);
    }

    @Override
    public double getArea() {
        return 2 * (width * height + height * depth + depth * width);
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid " +
                " point3D=" + point3D +
                " width=" + width +
                " height=" + height +
                " depth=" + depth +
                " area=" + getArea() +
                " volume=" + getVolume();
    }
}
