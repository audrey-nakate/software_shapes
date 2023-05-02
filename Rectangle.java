public class Rectangle extends Shape {
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