public abstract class Shape {
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