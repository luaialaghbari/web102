

public class Instructor extends Person
{
	
	private double salary;
	
	
	public Instructor(double yearlySalary)
	{
		salary = yearlySalary;
	}
	
	
	public String toString()
	{
		return getClass().getName() + super.toString() + "[Salary=" + getSalary() + "]";
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public void setSalary(double yearlySalary)
	{
		salary = yearlySalary;
	}
}
