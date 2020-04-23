import java.lang.reflect.Array;

public class Calculator 
{
public int add(int a, int b) 
{
	return a + b;
}
public double add(double a, double b) 
{
	return a + b;
}
public double add(int a, double b) 
{
	return add((double)a,b);
}
public int add(int a, int b, int c) 
{
	return add(add(a,b),c);
}
public int [] add(int array[], int b) 
{
	for(int i = 0; i <array.length; i++) 
	{
		 array[i] =  add(array[i], b);
	}
	return array;
}
public Rectangle add(Rectangle a, Rectangle b) 
{
	return new Rectangle(add(a.getWidth(),b.getWidth()), add(a.getLength(), b.getLength()));
}
public int subtract(int a, int b) 
{
	return add(a, -b);
}
public int subtract (double a, double b) 
{
	return subtract((int)a,(int)b);
}
public int[] subtract (int array[], double b) 
{
	for (int i =0; i<array.length; i++) 
	{
		array[i] = (int)(subtract((double) array[i], b));
		
	}
	return array;
}
public Rectangle subtract (Rectangle a, Rectangle b) 
{
	return new Rectangle(subtract(a.getWidth(),b.getWidth()) ,subtract(a.getLength(),b.getLength()) );
}
public double div (double a, double b) 
{
	return a/b;
}
public int[] div (int array[], double b) 
{
	for (int i =0; i<array.length; i++) 
	{
		array[i] = (int)(div((double) array[i], b));
		
	}
	return array;
}
public Rectangle div (Rectangle a, double b) 
{
	return new Rectangle(div(a.getWidth(),b) ,div(a.getLength(),b));
}	
public double mult(double a, double b) 
{
	return a*b;
}
public double mult(int a, double b) 
{
	return mult((double)a,b);
}
public int[] mult(int array[], double b) 
{
	for (int i =0; i<array.length; i++) 
	{
		array[i] = (int)(mult((double) array[i], b));
		
	}
	return array;
}
public Rectangle mult(Rectangle a, double b) 
{
	return new Rectangle(mult(a.getWidth(),b) ,mult(a.getLength(),b));
}
public String mult(int a, String temp) 
{
	String output ="";
	for (int i =0; i<a; i++) 
	{
		output = output.concat(temp);
	}
	return output;
}
	public String mult(double a, String temp)
    {
		int output = (int) mult(temp.length(),(a - (int)a));
		return mult((int)a,temp).concat(temp.substring(0,output));
    }
}

