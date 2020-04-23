package Polymorphism;

import java.util.ArrayList;

public class Manager extends Employee
{
    private ArrayList<Employee> subordinates = new ArrayList<Employee>();

    public Manager() 
    {
        this("Manager");
    }

    public Manager(String name)
    {
        super(name);
    }

    public Manager(String name, int ID, double salary)
    {
        super(name, ID, salary);
    }

    public void addEmployee()
    {
        this.addEmployee(new Employee());
    }

    public void addEmployee(Employee employee)
    {
        subordinates.add(employee);
    }

    public Employee findEmployee(int ID)
    {
    	for (int i=0; i<subordinates.size(); i++) 
		{
			if (subordinates.get(i).ID == ID)
			{
				return subordinates.get(i);
			}
		}
			return null;
		}

    public Employee findEmployee(String name)
    {
    	for (int i=0; i<subordinates.size(); i++) 
		{
			if (subordinates.get(i).name.equals(name))
			{
				return subordinates.get(i);
			}
			
		}
		return null;
	}

    public void setSalary(Employee employee , double salary)
    {
        findEmployee(employee.ID).setSalary(salary);
    }

    public Manager makeManager(Employee employee, double bonus)
    {
    	employee.setSalary(employee.getSalary()+bonus);
        return new Manager(employee.name, employee.ID, employee.getSalary());
    }

    public Manager makeManager(String name, double bonus)
    {
        return this.makeManager(findEmployee(name), bonus);
    }

    public Manager makeManager(int ID, double bonus)
    {
        return this.makeManager(findEmployee(ID), bonus);
    }

    @Override
    public ArrayList<Employee> getSubordinates() 
    {
        return subordinates;
    }
}