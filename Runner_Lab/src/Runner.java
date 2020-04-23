
import java.util.Scanner;
 public class Runner
 
{
 
	static void Example_1() //Rectangle
	{
		Rectangle temp = new Rectangle(0,0);
		temp.print();
		System.out.println();
		
		temp.SetLength(2.5);
		temp.SetWidth(3.0);
		//Consider how your rectangle will change after setting the length and width to specific values.
		temp.print();
		temp.Area();
		temp.Perimeter();
		System.out.println();
		
		Rectangle r = new Rectangle(3.5,2.0);
		r.print();
		r.Area();
		r.Perimeter();
		System.out.println();
	}
	
	static void Example_2() // Circle
	{
		// Math.PI is how you use pi
		Circle c = new Circle(0.0);
	
		c.print();
		
		System.out.println();
		
		c.Set_Radius(3);
		c.print();
		
		System.out.println();
		
		//This is acceptable, but you need to be VERY careful when writing code like this.
		c.Set_Radius(1.1);
		Circle circle = new Circle(1.1);
		circle.print();
		System.out.println();
	}

	public static void Example_3() // Triangle
	{
		Triangle T = new Triangle(0.0,0.0);
		T.print();

		System.out.println();
		
		Triangle Tri = new Triangle(2.1,2);
		Tri.print();
	//	Tri.print();
	}

 
	public static void Example_4()
	{
		Triangle Tri = new Triangle(0,0);
		Tri.print();
		
		System.out.println();
		
		// LOOK carefully at the output
		Tri.setBase(5.0);
		Tri.setHeight(6.0);
		Tri.print();
	}


	public static void main(String[] args)
	{
		Example_1();	
		Example_2();
		Example_3();
		Example_4();		
		
	}
}
