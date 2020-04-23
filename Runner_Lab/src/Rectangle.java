
class Rectangle
{
    private static double Length;
    private static double Width;
    
    Rectangle( double L, double W)
    {
        Width = W;
        Length = L;
        
    }
    public static void Area ()
    {
        System.out.println("This Area is " + (Width*Length));
    }
    public static void Perimeter()
    {
        System.out.println("The Perimeter is " + ((2*Width)+(2*Length)));
        
    }
    
    public void print()
    {
        System.out.println("The rectangle has a length of " + Length + " and width of " + Width);
        
    }
    
    public double SetLength(double s)
    {
        Length = s;
        System.out.println("Length was changed to " + Length);
        return Length;
    }
    public double SetWidth(double a)
    {
        Width = a;
        System.out.println("Width was changed to  " + Width);
        return Width;
    }
}