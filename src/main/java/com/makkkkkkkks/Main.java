package main.java.com.makkkkkkkks;

import main.java.com.makkkkkkkks.point.Point2D;
import main.java.com.makkkkkkkks.point.Point3D;
import main.java.com.makkkkkkkks.shape.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle(new Point2D(3, 1), new Point2D(50, 71), new Point2D(21, 7)));
        shapes.add(new Rectangle(new Point2D(15, 15), 15, 15));
        shapes.add(new Circle(new Point2D(10, 5), 10));
        shapes.add(new Cuboid(new Point3D(12, 32, 15), 51, 12, 41));
        shapes.add(new Sphere(new Point3D(10, 10, 10), 20));
        shapes.add(new SquarePyramid
                (new Point3D(10, 10, 10),
                        new Point3D(20, 20, 20),
                        new Point3D(30, 30, 30),
                        new Point3D(40, 40, 40),
                        new Point3D(50, 50, 50),
                        10, 20));
        shapes.forEach(shape -> System.out.println(shape.toString()));
    }
}
