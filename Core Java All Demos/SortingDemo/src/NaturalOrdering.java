import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class NaturalOrdering 
{
	public static void main(String[] args) 
	{
		Student st1=new Student(100, "jkjfjf");
		Student st2=new Student(10, "jkjfjf");
		Student st3=new Student(1010, "jkjfjf");
		Student st4=new Student(60, "jkjfjf");
	
		List <Student>list=new ArrayList<Student>();
	
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
	
		System.out.println("Before sorting");
		System.out.println(list);
		
		Collections.sort(list);
		
		//st1.compareTo(st2);
		System.out.println("After Sorting");
		System.out.println(list.toString());
	}

}
