
interface Shape {
    double area(); 
}

class Circle implements Shape{
    private int radius = 10; 
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Square implements Shape {
    private int side = 5;
    public double area() {
        return side * side;
    }
}

class CalculateArea {
    public void calculate(Shape shape) {
        System.out.println(shape.area());
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        CalculateArea calculateArea = new CalculateArea();
        calculateArea.calculate(square);
        calculateArea.calculate(circle);
    }
}
