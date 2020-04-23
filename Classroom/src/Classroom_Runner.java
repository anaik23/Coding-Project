
public class Classroom_Runner {

	public static void main(String[] args) 
	{
		Student s = new Student("Robert", "A", "Frost");

	}
	
	public static double calcPercentage(Student x) 
	{
		double tPoints =0;
		double denominator = 0;
		for(int i=0; i<x.gradeBook.length; i++) 
		{
			if (x.gradeBook[i].earnedPoints.equals("E")) 
			{
				tPoints+=0;
				denominator+=0;
			}
			else 
			{
				tPoints += x.gradeBook[i].getPoints();
				denominator+= x.gradeBook[i].totalPoints;
			}
		
		}
		return tPoints/denominator;
	}

}
