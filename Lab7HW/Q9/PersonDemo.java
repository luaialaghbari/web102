
public class PersonTest
{
	public static void main(String[] args)
	{
		Person man = new Person();
		man.setName("luai");
		man.setBirthYear(2002);
		
		Student boy = new Student("Programming");
		boy.setName("Ali");
		boy.setBirthYear(2006);
		
		Instructor teacher = new Instructor(80000);
		teacher.setName("Ahmed");
		teacher.setBirthYear(1998);
		
		System.out.println(man.toString());
		System.out.println(boy.toString());
		System.out.println(teacher.toString());
	}

}
