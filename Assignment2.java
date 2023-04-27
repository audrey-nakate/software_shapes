import java.lang.Math;

public class Assignment2 {
    public static void main(String[] args) {
        // an example
        Point center = new Point(495, 242);
        Point posn = new Point(5.5, 10.5);

        Circle circle = new Circle(center, 4);
        Rectangle rect = new Rectangle(center, 22.5, 33.3);
        Square square = new Square(center, 6);
        
        circle.shapeDetails(circle, posn);
        rect.shapeDetails(rect, posn);
        square.shapeDetails(square, posn);
    }
}

//comment to add changes
class Point {
    // coordinates of a point
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

abstract class Shape {
    static Point center;
    String name;

    public Shape(Point center) {
        Shape.center = center;
    }

    public Point getCenter() {
        return center;
    }

    //returns the perimeter of the given shape
    public abstract double perimeter();

    //returns the area of the given shape
    public abstract double area();

    //determines whether a position can be found on the shape in question
    public abstract boolean contains(Point posn);

    void shapeDetails(Shape shape, Point point) {
        /*
         * This method prints out the area and preimeter of the given shape and whether
         * it contains the given position or not
         */
        System.out.println("The area of the " + shape.name + " is " + shape.area());
        System.out.println("The perimeter of the " + shape.name + " is " + shape.perimeter());
        String contains = (shape.contains(point)) ? "The " + shape.name + " contains the position"
                : "The " + shape.name + " does not contain the position";
        System.out.println(contains);
    }
}

class Circle extends Shape {
    private float radius;

    public Circle(Point center, float r) {
        super(center);
        this.radius = r;
        this.name = "circle";
    }

    public double area() {
        // return (float) (3.14 * radius * radius);
        return (float) ((float) Math.PI * Math.pow(radius, 2));
    }

    public double perimeter() {
        return Math.PI * radius * 2;
    }

    public boolean contains(Point point) {
        // distSquared - disatnce from the point to the center of the circle
        double distSquared = Math.pow((point.x - center.x), 2) + Math.pow((point.y - center.y), 2);
        double radiusSquared = Math.pow(radius, 2);
        return distSquared <= radiusSquared;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(Point center, double width, double height) {
        super(center);
        this.width = width;
        this.height = height;
        this.name = "rectangle";
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double area() {
        return width * height;
    }

    public boolean contains(Point posn) {
        double halfWidth = width / 2;
        double halfHeight = height / 2;
        return posn.x >= center.x - halfWidth && posn.x <= center.x + halfWidth && posn.y >= center.y - halfHeight
                && posn.y <= center.y + halfHeight;
    }

}

class Square extends Shape {
    double size;

    public Square(Point center, double size) {
        super(center);
        this.size = size;
        this.name = "square";
    }

    public double getSize() {
        return size;
    }

    public double perimeter() {
        return 4 * size;
    }

    public double area() {
        return size * size;
    }

    public boolean contains(Point posn) {
        double halfSize = size / 2;
        return posn.x >= center.x - halfSize && posn.x <= center.x + halfSize && posn.y >= center.y - halfSize
                && posn.y <= center.y + halfSize;
    }

}
