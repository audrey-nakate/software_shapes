

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

    public abstract double perimeter();

    public abstract double area();

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


