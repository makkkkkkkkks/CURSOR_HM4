package shape;

import point.Point2D;

import java.util.ArrayList;
import java.util.Collections;

public class Circle extends PlaneShape {
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
