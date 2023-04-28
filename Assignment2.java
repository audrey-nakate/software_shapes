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
