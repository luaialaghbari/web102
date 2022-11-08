


public class Person
{
	private String name;
	private int birthYear;
	
	
	public Person()
	{
		name = "";
		birthYear = 0;
	}
	
	
	public String getName()
	{
		return name;
	}
	
	
	public void setName(String personName)
	{
		name = personName;
	}
	
	
	public void setBirthYear(int year)
	{
		birthYear = year;
	}
	
	
	public int getBirthYear()
	{
		return birthYear;
	}
	
	
	public String toString()
	{
		return getClass().getName() + "[Name=" + getName() + "][BirthYear=" + getBirthYear() + "]";
	}
	

}
