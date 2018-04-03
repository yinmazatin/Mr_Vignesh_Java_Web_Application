package test;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) 
	{

		Map <Student,Integer>map=new LinkedHashMap<Student,Integer>();
	
		Student s1=new Student(100, "hjfjf");
		Student s2=new Student(1050, "kjjghjfjf");
		Student s3=new Student(1100, "hjfjf");
		Student s4=new Student(1030, "XYZ");
		Student s5=new Student(1030, "XYZ");

		map.put(s1,1);
		map.put(s2,2);
		map.put(s3,3);
		map.put(s4,4);
		map.put(s5,5);

		System.out.println(map);
	}
}
