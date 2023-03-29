//import java.math.*;

public class Assignment2 {
    public static void main(String[] args) {
        // an example
        Circle myc = new Circle(4, 3, 6);
        System.out.println(myc.area());
        System.out.println(myc.contains(new Point(10, 50)));
    }
}

class Point {
    // coordinates of a point
    float x;
    float y;

    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    private Point center;
    private float radius;

    Circle(float x, float y, float r) {
        this.center = new Point(x, y);
        this.radius = r;
    }

    float area() {
        // return (float) (3.14 * radius * radius);
        return (float) ((float) Math.PI * Math.pow(radius, 2));
    }

    boolean contains(Point point) {
        // distSquared - disatnce from the point to the center of the circle
        double distSquared = Math.pow((point.x - center.x), 2) + Math.pow((point.y - center.y), 2);
        double radiusSquared = Math.pow(radius, 2);
        return distSquared <= radiusSquared;
    }
}