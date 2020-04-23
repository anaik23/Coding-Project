import java.util.Arrays;
import java.util.Scanner;

public class Classroom {
	
	
	public static void main(String[] args) 
	{
		Student[] group1 = new Student[15];
		Student[] group2 = new Student[15];
		System.out.println("The student count before admission into the class is " + Student.studentCount);
		group1[0] = new Student("Abdurrahman", "Connor");
		group1[1] = new Student("Humera", "A ", "Mcloughlin");
		group1[2] = new Student("Christopher","B", "Fernandez", 10);
		group1[3] = new Student("Dionne", "Higgins");
		group1[4] = new Student("Anja","C", "Moore");
		group1[5] = new Student("Zayd"," D", "Drew", 11);
		group1[6] = new Student("Dwayne", "Whitley");
		group1[7] = new Student("Abdi","E", "Wilde");
		group1[8] = new Student("Abbas","F", "Boyd", 12);
		group1[9] = new Student("Mariella", "Rees");
		group1[10] = new Student("Skyla","G", "Barnard");
		group1[11] = new Student("Jaye","H", "Povey", 13);
		group1[12] = new Student("Lacey", "Paul");
		group1[13] = new Student("Amina","I", "Strong");
		group1[14] = new Student("Samiya","J", "Banks", 14);
		group2[0] = new Student("Sianna", "Huang");
		group2[1] = new Student("Nafeesa","K", "Rosales");
		group2[2] = new Student("Debbie","L", "Rush", 15);
		group2[3] = new Student("Idrees", "Andrew");
		group2[4] = new Student("Dominykas","M", "Cantu");
		group2[5] = new Student("Mariyam","N", "Dotson", 16);
		group2[6] = new Student("Ibrar", "Howells");
		group2[7] = new Student("Haris","O", "Farrow");
		group2[8] = new Student("Reem", "P", "Russell", 17);
		group2[9] = new Student("Rehaan", "Christian");
		group2[10] = new Student("Kiyan","Q", "Bull");
		group2[11] = new Student("Niall", "U", "Griffiths", 18);
		group2[12] = new Student("Alys", "Crane");
		group2[13] = new Student("Tobi","R", "Lawrence");
		group2[14] = new Student("Angus", "S", "Jacobson",12);
		for (int i=0; i<group1.length; i++) 
		{
			System.out.println(group1[i]);
		}
		for (int i=0; i<group2.length; i++) 
		{
			System.out.println(group2[i]);
		}
		System.out.println("The student count after admission into the class is " + Student.studentCount);
		
		System.out.println(" ");
		System.out.println("Class Partners");
		for(int i = 0; i < group1.length-2; i++)
		{
			System.out.println(group1[i] + " and " + group2[i] + " are class partners");
		}
		
		System.out.println(" ");
		System.out.println("find_Shortest:");
		System.out.println(find_Shortest(group1) + "in");
		System.out.println(" ");
		System.out.println("find_Shortest1:");
		System.out.println(find_Shortest1(group1, group2) + "in");
		
		System.out.println(" ");
		System.out.println("find_Student:");
		Scanner read = new Scanner(System.in);
		System.out.println("Enter First Name of Student:");
		String fname = read.nextLine();
		System.out.println("Enter Last Name of Student:");
		String lname = read.nextLine();
		find_Student(group1, group2, fname, lname);
		
		
		
		System.out.println(" ");
		System.out.println("Swapping Example:");
		System.out.println(Arrays.toString(swap_Location(group1)));
		
		
		System.out.println(" ");
		System.out.println("Adding element to the beginning of an array:");
		System.out.println(Arrays.toString(place_In_Front(group1)));
		
		
	}
	static int find_Shortest(Student[] group1) 
	{
		Student groupT1[] = group1;
		int shortest_a = groupT1[0].getheight();
		for (int i =0; i<group1.length; i++) 
		{
			if (groupT1[i].getheight() < shortest_a)
			{
				shortest_a = groupT1[i].getheight();
			}
		}
		return shortest_a;
	}
	
	static int find_Shortest1(Student[] group1, Student[] group2) 
	{
		Student groupTemp1[] = group1;
		Student groupTemp2[] = group2;
		int shortest_a1 = groupTemp1[0].getheight();
		int shortest_b1 = groupTemp2[0].getheight();
		for (int i =0; i<group1.length; i++) 
		{
			if (groupTemp1[i].getheight() < shortest_a1)
			{
				shortest_a1 = groupTemp1[i].getheight();
			}
		}
		for (int i=0; i<group2.length; i++) 
		{
			if (groupTemp2[i].getheight() < shortest_b1)
			{
				shortest_b1 = groupTemp2[i].getheight();
			}
		}
		if (shortest_a1 > shortest_b1) 
		{
			return shortest_b1;
		}
		else 
		{
			return shortest_a1;
		}
		
	}
	static void find_Student(Student[] group1, Student[] group2, String fname, String lname) 
	{
		int nameSizef = fname.length();
		int nameSizel = lname.length();
		Student s1[] = group1;
		Student s2[] = group2;
		int count = 0;
		String firstName = "";
		String lastName = "";
		int age = 0;
		int ID =0;
		int height= 0;
		double [] grades = new double [6];
		double GPA = 0;
		
		for (int i=0; i<s1.length; i++) 
		{
			if (s1[i].getfirstName().compareTo(fname)==0 && s1[i].getlastName().compareTo(lname)==0) 
			{
				count++;
				firstName = s1[i].getfirstName();
				lastName = s1[i].getlastName();
				age = s1[i].getage();
				ID = s1[i].getID();
				height = s1[i].getheight();
				grades = s1[i].getgrades();
				GPA = s1[i].getGPA();
				
			}
		}
		for (int i=0; i<s2.length; i++) 
		{
			if (s2[i].getfirstName().compareTo(fname)==0 && s2[i].getlastName().compareTo(lname)==0) 
			{
				count++;
				firstName = s2[i].getfirstName();
				lastName = s2[i].getlastName();
				age = s2[i].getage();
				ID = s2[i].getID();
				height = s2[i].getheight();
				grades = s2[i].getgrades();
				GPA = s2[i].getGPA();
				
			}
		}
		if (count == 0) 
		{
			System.out.println("That student is not enrolled in this school");
		}
		
		if (count == 1) 
		{
			System.out.println(firstName + " " + lastName + " " + "ID# " + ID + " " + "Age: " + age + " " + "Height: " + height + " " + "Grades: " + Arrays.toString(grades) + " " + "GPA: " + GPA);
		}
		
		
	}


	public static Student[] swap_Location(Student[] group1)
	{
		int start = 0;
		int end = 1;
		Student temp = group1[start];
		group1[0] = group1 [1];
		group1 [1] = temp;
		System.out.println(group1[0]);
		System.out.println(group1[1]);
		return group1;
		
	}
	public static Student[] place_In_Front(Student[] group1) 
	{
		Student[] group1New = new Student [16];
		for (int i=0; i<group1.length; i++) 
		{
			group1New[i] = group1[i];
		}
		Student temp1 = group1New[0];
		group1New[0] = group1New [15];
		group1New [15] = temp1;
		group1New[0] = new Student("Abhay", "V", "Naik",17);
		return group1New;
		
	}
	
}
