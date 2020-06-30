package point;

public class Point3D extends Point {
    public Point3D(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public String toString() {
        return
                "x= " + super.getX() +
                "y= " + super.getY() +
                "z= " + super.getZ();
    }
}
