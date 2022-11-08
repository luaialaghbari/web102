
public class Student extends Person
{
	
	private String major;
	
	
	public Student(String studentMajor)
	{
		major = studentMajor;
	}
	
	
	public String toString()
	{
		return getClass().getName() + super.toString() + "[Major=" + getMajor() + "]";
	}
	
	
	public String getMajor()
	{
		return major;
	}
	
	
	public void setMajor(String studetnMajor)
	{
		major = studetnMajor;
	}
}
