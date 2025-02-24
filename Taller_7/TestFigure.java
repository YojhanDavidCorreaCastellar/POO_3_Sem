package Taller_7;

abstract class Figure {
    private String area;

    public abstract void calculateArea();
    
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
}

abstract class Circle extends Figure {
} 

abstract class Triangle extends Figure {
}

public abstract class TestFigure {
    public static void main(String[] args) {

        Circle circle = new Circle() {
            @Override
            public void calculateArea() {
                System.out.println("");
                System.out.println("");

                setArea("Area of the circle: " + Math.PI * Math.pow(8, 15));
            }
        };
        circle.calculateArea();
        System.out.println(circle.getArea());
        
        Triangle triangle = new Triangle() {
            @Override
            public void calculateArea() {
                System.out.println("");

                setArea("Area of the triangle: " + (8 * 15) / 2);
            }
        };
        triangle.calculateArea();
        System.out.println(triangle.getArea());
    }
}




