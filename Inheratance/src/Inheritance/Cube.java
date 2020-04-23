package Inheritance;

public class Cube extends RectangularPrism {
    public Cube() 
    {
        this(1.0);
        System.out.println("I am entering the Cube's Normal constructor");
        System.out.println("I am exiting the Cube's Normal constructor");
    }

    public Cube(double side) 
    {
        super(side, side, side);
        super.calculate();
        System.out.println("I am entering the Cube's Overloaded constructor");
        System.out.println("I am exiting the Cube's Overloaded constructor");
    }
    public void setSide(double side) 
    {
        super.setLength(side);
        super.setWidth(side);
        super.setHeight(side);
    }
    public void setHeight(double height) 
    {
        this.setSide(height);
    }
    public void setLength(double length) 
    {
        this.setSide(length);
    }
    public void setWidth(double width) 
    {
        this.setSide(width);
    }
    public double getSide() 
    {
        return super.getLength();
    }
    public String toString() {
        return "I am a Cube with side of " + this.getSide();
    }
}