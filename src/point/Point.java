package point;

public abstract class Point {
    private double x;
    private double y;
    private double z;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double calculateDistance(Point point) {
        return Math.sqrt(
                Math.pow(this.x - point.getX(), 2)
                        + Math.pow(this.y - point.getY(), 2)
                        + Math.pow(this.z - point.getZ(), 2));
    }
}
