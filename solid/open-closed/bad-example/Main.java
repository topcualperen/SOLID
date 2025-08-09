
class AreaCalculator {
    public double calculate(Object shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
        } else if (shape instanceof Square) {
            Square square = (Square) shape;
            return square.side * square.side;
        }
        return 0;
    }
}

class Circle { double radius; }
class Square { double side; }

public class Main {
    
}
