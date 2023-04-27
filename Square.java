
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
