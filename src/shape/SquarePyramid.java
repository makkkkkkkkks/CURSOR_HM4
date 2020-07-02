package shape;

import point.Point3D;

import java.util.Arrays;

public class SquarePyramid extends SpaceShape {
    private double baseWidth;
    private double pyramidHeight;

    public SquarePyramid(Point3D pointA, Point3D pointB, Point3D pointC, Point3D pointD, Point3D pointE, double baseWidth, double pyramidheight) {
        super(Arrays.asList(pointA, pointB, pointC, pointD, pointE));
        this.baseWidth = baseWidth;
        this.pyramidHeight = pyramidheight;
    }

    @Override
    public double getArea() {
        return (4 * baseWidth) / 2 * ((baseWidth / (2 * Math.tan(Math.toRadians(45))))
                + Math.sqrt(Math.pow(pyramidHeight, 2) + (Math.pow(baseWidth / 2 * Math.tan(Math.toRadians(45)), 2))));
    }

    @Override
    public double getVolume() {
        return Math.pow(baseWidth, 2) * pyramidHeight / 3;
    }

    @Override
    public String toString() {
        return "SquarePyramid" +
                getPoints() +
                " baseWidth=" + baseWidth +
                " pyramidHeight=" + pyramidHeight;
    }
}