package Day5Homework;

abstract class Shape{
    public abstract double calculateArea();
}

class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (Math.pow(radius,2)*3.142);
    }

    public String toString() {
        return "Day5Homework.Circle area is: " + calculateArea();
    }
}

class Rectangle extends Shape{
    private double width;
    private  double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (width * height);
    }

    public String toString(){
        return "Day5Homework.Rectangle area is: " + calculateArea();
    }
}

public class Shape_5_1 {
    public static void main(String[] args) {
       Shape circle = new Circle(8.1);
       Shape rectangle = new Rectangle(5,3);

        System.out.println("The circle area is: " + circle);
        System.out.println("The rectangle area is: " + rectangle);

    }
}
