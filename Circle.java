
public class Circle extends Shape{
   
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
