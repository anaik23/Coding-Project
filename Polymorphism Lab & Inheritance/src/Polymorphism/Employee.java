package Polymorphism;

import java.util.ArrayList;

public class Employee 
{
	public static int employee_Count;
	public String name;
	public int ID;
	private double salary;
	
	public Employee() 
	{
		employee_Count++;
		name = "John";
		ID = employee_Count;
		salary = 70000.00;
		
	}
	public Employee(String name) 
	{
		this();
		this.name = name;
	}
	public Employee(String name, int ID, double salary) 
	{
		this.name = name;
		this.ID = ID;
		this.salary = salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public double getSalary() 
	{
		return salary;
	}
	public ArrayList<Employee> getSubordinates()
	{
        return null;
	}
}
