import java.util.Scanner;


public class Student implements Comparable<Student>
{
	Integer id;
	String name;
	
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public String toString()
	{
		return id+" : "+name;
	}

	@Override
	public int compareTo(Student obj)
	{
		return -(id-obj.id);
	}
	
}
