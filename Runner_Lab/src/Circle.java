class Circle
{
   private static double Radius;
    Circle(double r)
    {
        Radius = r;
    }

public void print()
{
    System.out.println("The Circle has a radius of  " +   Radius);
    System.out.println("The area of the circle is " + area(Radius));  
    System.out.println(" The circumference of the rectangle is " + com(Radius));  
}
private double com(double b)
{
    b = ((Radius*2) * Math.PI);
    return b;
    
}
private double area(double area)
{
    area = (Math.PI*(Radius*Radius));
    return area;
}
public double Set_Radius(double c)
{
   Radius = c;
   System.out.println("The radius was changed to  " + Radius);
   return Radius;
}
}