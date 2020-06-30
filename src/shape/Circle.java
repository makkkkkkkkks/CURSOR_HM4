package shape;

import geometryInterface.AreaMeasurable;
import geometryInterface.PerimeterMeasurable;
import point.Point;
import point.Point2D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Circle extends Shape implements AreaMeasurable, PerimeterMeasurable {
    private Point2D center;
    private double radius;

    public Circle(Point2D center, double radius) {
        super(new ArrayList<>(Collections.singletonList(center)));
        this.center = center;
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle " +
                " point2D=" + center +
                " radius=" + radius +
                " perimeter=" + getPerimeter() +
                " area=" + getArea();
    }
}
