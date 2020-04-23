package Inheritance;

public class Square extends Rectangle 
{

    public Square() 
    {
        this(1.0);
        System.out.println("I am entering the Square's Normal constructor");
        System.out.println("I am exiting the Square's Normal constructor");
    }

    public Square(double side) 
    {
        super(side, side);
        System.out.println("I am entering the Square's Overloaded constructor");
        System.out.println("I am exiting the Square's Overloaded constructor");
    }
    public void setSide(double side)
    {
        super.setLength(side);
        super.setWidth(side);
    }
    public void setLength(double length) {
        this.setSide(length);
    }
    public void setWidth(double width) {
        this.setSide(width);
    }
    public double getSide() 
    {
        return super.getLength();
    }
    
    public String toString() {
        return "I am a Square with side of " + this.getSide();
    }
}