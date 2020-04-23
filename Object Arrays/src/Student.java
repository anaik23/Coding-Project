import java.util.Arrays;

public class Student 
{
	//variables
	public static int studentCount;
	private String firstName;
	private String middleName;
	private String lastName;
	private int age;
	private int ID;
	private int height;
	private double [] grades = new double [6];
	public Student classPartner;
	public double GPA;
	//constructors
	public Student()
	{
		studentCount++;
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.ID = studentCount;
		this.age = (int)(101*Math.random()*1);
		int heightInches =(int)(60*Math.random()+24);
		height = heightInches;
		for (int i =0; i<grades.length; i++) 
		{
			this.grades [i] = ((int)(Math.random()*99+1));
		}
		for (int i = 0; i<grades.length; i++)
		{
			if (grades[i] >= 90)
			{
				GPA+=4;
			}
			else if (grades[i] < 90 && grades[i] >= 80)
			{
				GPA+=3;
			}
			else if (grades[i] < 80 && grades[i] >= 70)
			{
				GPA+=2;
			}
			else if (grades[i] < 70 && grades[i] >= 65)
			{
				GPA+=1;
			}
			else 
			{
				GPA+=0;
			}
			
		}
		this.GPA = (GPA/6);
		
	}
	public Student(String firstName, String lastName) 
	{
		this();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Student(String firstName, String middleName, String lastName) 
	{
		this(firstName, lastName);
		this.middleName = middleName;
	}
	public Student(String firstName, String middleName, String lastName, int age)
	{
		this(firstName, middleName, lastName);
		this.age = age;
	}
	//getters and setters
	public String getfirstName() 
	{
		return firstName;
	}
	public void setfirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getmiddleName() 
	{
		return middleName;
	}
	public void setmiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	public String getlastName() 
	{
		return lastName;
	}
	public void setlastName(String lastName) 
	{
		this.lastName = lastName;
	}
	public int getage() 
	{
		return age;
	}
	public void setage(int age) 
	{
		this.age = age;
	}
	public int getID() 
	{
		return ID;
	}
	public void setID(int ID)
	{
		this.ID = ID;
	}
	public int getheight() 
	{
		return height;
	}
	public void setheight(int height) 
	{
		this.height = height;
	}
	public double[] getgrades() 
	{
		return grades;
	}
	public void setgrades(double[] grades) 
	{
		this.grades = grades;
	}
	public double getGPA() 
	{
		return GPA;
	}
	public void setGPA(double GPA) 
	{
		this.GPA = GPA;
	}
	
	//toString methods
	public String toString() 
	{
		return "This student's name is: " + firstName + " " + lastName + " " + "ID# " + ID + " " + "Age: " + age + " " + "Height: " + height + " " + "Grades: " + Arrays.toString(grades) + " " + "GPA: " + GPA;  
	}
	//display grades method
	public String displayGrades() 
	{
		for (int i =0; i<grades.length; i++) 
		{
			this.grades [i] = ((int)(Math.random()*100));
		}
		return firstName + " " + lastName + ", Grades: " + Arrays.toString(grades);

		
	}
	//calculated GPA
	public double GPA()
	{
		for (int i = 0; i<grades.length; i++)
		{
			if (grades[i] >= 90)
			{
				GPA+=4;
			}
			else if (grades[i] < 90 && grades[i] >= 80)
			{
				GPA+=3;
			}
			else if (grades[i] < 80 && grades[i] >= 70)
			{
				GPA+=2;
			}
			else if (grades[i] < 70 && grades[i] >= 60)
			{
				GPA+=1;
			}
			else 
			{
				GPA+=0;
			}
			
			
		}
		return GPA;
	}
	
	
	
	
}
