import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class CalculateTime
{

	public static void calculateTiming(List <String>list,String type)
	{
		long start=System.currentTimeMillis();
		
		for(long i=0;i<100000;i++)
		{
			list.add("Batch3");
		}
		
		long end=System.currentTimeMillis();
		
		System.out.println("Time taken for "+type+" is "+(end-start));
	}
	public static void main(String[] args) 
	{
		List <String>arrList=new ArrayList<String>();
		List <String>linkedList=new LinkedList<String>();
		
		calculateTiming(arrList, "Array List");
		calculateTiming(linkedList, "Linked List");
	}

}
