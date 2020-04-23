class Triangle
{
    static double Height;
    static double Base;
   Triangle(double B,double H)
    {
        Height = H;
        Base = B;
    }
    public void print()
    {
        while ( Base>1)
        {
            System.out.println("The height was changed by " +  Height  + " and the base was changed by " + Base);
            break;
        }
        System.out.println("This Traingle has a base of "  +  Base  +    "and a height of   "+  Height );
        System.out.println("The area of the traingle is : " + area(Base,Height) );
        System.out.println("This triangle has a perimeter of  " + perimeter(Base,Height) );

        
    }
    private double area(double Base, double Height)
    {
       double area = ((Base * Height)/2);
        return area;
    }
     private double perimeter( double Base, double Height)
     {
        double perimeter = (Math.sqrt((Base*Base)+(Height*Height))) + (Base + Height);
        return perimeter;
        
     }
     public double setHeight(double h)
     {
         Height= h;
         System.out.println("The height was change by   " + Height);
         return Height;
     }
     public double setBase( double h)
     {
     Base = h;
     System.out.println("the base was changed by  " + Base);
     return Base;
     }
 
}