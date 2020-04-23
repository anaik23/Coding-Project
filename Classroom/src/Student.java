import java.util.ArrayList;

public class Student 
{
	String firstName;
	String middleName;
	String lastName;
	ArrayList<Student>siblings;
	Assignment[]gradeBook;
	
	public Student(String F, String M, String L) 
	{
		
	}
	public String fullName()
	{
		String f = firstName;
		String m = middleName;
		String l = lastName;
		
		return f + " " + m + " " + l;
	}
	public ArrayList<String>getSiblingNames()
	{
		ArrayList<String> sibName = new ArrayList<String> ();
		for (int i = 0; i< siblings.size(); i++) 
		{
			sibName.add(siblings.get(i).firstName);
			sibName.add(siblings.get(i).middleName);
			sibName.add(siblings.get(i).lastName);
		}
		return sibName;
	}
	
}
