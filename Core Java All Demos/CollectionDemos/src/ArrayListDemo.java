import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class ArrayListDemo
{
	public static void main(String[] args) 
	{
		LinkedList arr=new LinkedList<Integer>();
		
		arr.add(100);
		arr.add(20);
		arr.add(50);
		arr.add(98);
		arr.add(42);
		arr.add(78);
		//arr.add("Vandate"); Throws exception
		
		Collections.sort(arr);
		
		System.out.println(arr);
		
		ArrayList <String>arr1=new ArrayList<String>();
		
		arr1.add("XYZ");
		arr1.add("aB");
		arr1.add("AC");
		arr1.add("BC");
		arr1.add("ABCD");
		arr1.add("AB");
		
		Collections.sort(arr1);
		System.out.println(arr1);

		String str="";
		for(String s:arr1)
		{
			str+=(s+="...");
		}
		System.out.println(str);
	}

}
