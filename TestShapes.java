import java.lang.Math;
// testing the code
public class TestShapes {
    public static void main(String[] args) {
        Post center = new Post(0, 3);

        // create a square with center at (0,0) and size 5
        Square square = new Square(center, 5);

        // create a rectangle with center at (0,0), width 4, and height 6
        Rectangle rectangle = new Rectangle(center, 4, 6);

        // create a circle with center at (0,0) and radius 3
        Circle circle = new Circle(center, 3);

        // print the perimeter and area of each shape
        System.out.println("Perimeter of square: " + square.perimeter());
        System.out.println("Area of square: " + square.area());

        System.out.println("Perimeter of rectangle: " + rectangle.perimeter());
        System.out.println("Area of rectangle: " + rectangle.area());

        System.out.println("Perimeter of circle: " + circle.perimeter());
        System.out.println("Area of circle: " + circle.area());

        // check if the shapes contain the point (1,1)
        Post point = new Post(1, 1);

        System.out.println("Square contains point (1,1): " + square.contains(point));
        System.out.println("Rectangle contains point (1,1): " + rectangle.contains(point));
        System.out.println("Circle contains point (1,1): " + circle.contains(point));
    }
}

// rectangle shape
class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(Post center, double width, double height){
        super(center); // this allows us to use the centre method from the shape class
        this.width = width;
        this.height = height;
    }

    // getters 
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // perimeter and area
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public double area() {
        return width * height;
    }

    // getting the centre
    @Override
    public boolean contains(Post pos) {
        double halfWidth = width / 2;
        double halfHeight = height / 2;
        return pos.getX() >= center.getX() - halfWidth
                && pos.getX() <= center.getX() + halfWidth
                && pos.getY() >= center.getY() - halfHeight
                && pos.getY() <= center.getY() + halfHeight;
    }



}
