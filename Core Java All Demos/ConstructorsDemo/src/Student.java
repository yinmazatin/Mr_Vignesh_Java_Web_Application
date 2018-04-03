
public class Student
{
	int id;
	String name;
	
	Student()
	{
		id=0000;
		name=null;
		
		System.out.println("Default values have been assinged to variables");
	}
	Student(int id1, String name1)
	{
		id=id1;
		name=name1;
		
		System.out.println("Constructor invoked for Mr."+name);
	}
	
	void print()
	{
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
	}
	public static void main(String[] args) 
	{
		Student kim=new Student(100,"KIM");
		Student samann=new Student(101,"Samann");
		Student tola=new Student(102,"Tola");
		Student van=new Student(103,"Van");
	
		Student def=new Student();
		
		kim.print();
		samann.print();
		tola.print();
		van.print();
		def.print();
	}

}
