interface Shape {
    double getArea();
}

class Rectangle implements Shape{
    private int width = 10;
    private int height = 60;
    public double getArea() {
        return height * width;
    }
}

class Square implements Shape {
    private int side = 50;
    public double getArea() {
        return side * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        System.out.println(square.getArea());
    }
}