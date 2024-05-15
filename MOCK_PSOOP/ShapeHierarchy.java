class Quadrilateral {
    int x1,y1;
    int x2,y2;
    int x3,y3;
    int x4,y4;

    public Quadrilateral(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

}

class Trapezoid extends Quadrilateral {
    int height;
    int base1;
    int base2;
    
    public Trapezoid(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public void setSides() {
        base1 = Math.abs(x2 - x1);
        base2 = Math.abs(x4 - x3);
        height = Math.abs(y4 - y1);
    }

    public double getArea() {
        return (base1 + base2) * height * 0.5;
    }
}

class Parallelogram extends Quadrilateral {
    int height;
    int base;

    public Parallelogram(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public Parallelogram(int x1, int x2, int y1, int y4) {
        super(x1, y1, x2, 0, 0, 0, 0, y4);
    }

    public void setSides() {
        base = Math.abs(x2 - x1);
        height = Math.abs(y4 - y1);
    }

    public double getArea() {
        return base * height;
    }

}

class Rectangle extends Parallelogram {
    public Rectangle(int x1, int y1, int x2, int y4) {
        super(x1, y1, x2, y4);
    }

    public double getArea() {
        setSides();
        return base * height;
    }

}

class Square extends Rectangle {
    public Square(int x1, int x2) {
        super(x1, 0, x2, 0);
    }

    @Override
    public void setSides() {
        base = x2-x1;
    }

    @Override
    public double getArea() {
        setSides();
        return Math.pow(base, 2);
    }

}

public class ShapeHierarchy {
    public static void main(String[] args) {
        Trapezoid trapezoid = new Trapezoid(0, 0, 4, 0, 3, 3, 1, 3);
        trapezoid.setSides();
        System.out.println("Area of Trapezoid: " + trapezoid.getArea());

        Parallelogram parallelogram = new Parallelogram(0, 4, 0, 3);
        parallelogram.setSides();
        System.out.println("Area of Parallelogram: " + parallelogram.getArea());

        Rectangle rectangle = new Rectangle(0, 4, 0, 3);
        rectangle.setSides();
        System.out.println("Area of Rectangle: " + rectangle.getArea());

        Square square = new Square(4,0);
        square.setSides();
        System.out.println("Area of Square: " + square.getArea());
    }
}
