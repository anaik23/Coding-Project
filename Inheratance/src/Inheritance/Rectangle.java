package Inheritance;

public class Rectangle {
    private double length;
    private double width;
    private double area;
    private double perimeter;

    public Rectangle() 
    {
        this(1.0, 2.0);
        System.out.println("I am entering the Rectangle's Normal constructor");
        System.out.println("I am exiting the Rectangle's Normal constructor");
    }

    public Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
        this.calculate();
        System.out.println("I am entering the Rectangle's Overloaded constructor");
        System.out.println("I am exiting the Rectangle's Overloaded constructor");
    }

    public double getLength() 
    {
        return length;
    }
    public double getWidth() 
    {
        return width;
    }
    public double getPerimeter() 
    {
        return perimeter;
    }
    public double getArea() 
    {
        return area;
    }
    public void setLength(double length) 
    {
        this.length = length;
        this.calculate();
    }
    public void setWidth(double width) 
    {
        this.width = width;
        this.calculate();
    }
    public void calculate() 
    {
        this.area = length * width;
        this.perimeter = 2 * length + 2 * width;
    }
    public String toString() {
        return "I am a Rectangle with a width of " + width + " and a length of " + length;
    }
}

