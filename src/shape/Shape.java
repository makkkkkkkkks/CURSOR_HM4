package shape;

import point.Point;

import java.util.List;

public abstract class Shape {
    private List<Point> points;

    public Shape(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "points=" + points +
                '}';
    }
}
