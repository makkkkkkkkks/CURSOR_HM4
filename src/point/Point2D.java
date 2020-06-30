package point;

public class Point2D extends Point {
    public Point2D(double x, double y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return
                " x=" + super.getX() +
                        " y=" + super.getY();
    }
}
