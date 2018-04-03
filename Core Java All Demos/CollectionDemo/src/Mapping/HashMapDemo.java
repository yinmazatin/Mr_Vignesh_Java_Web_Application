package Mapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo
{
	public static void main(String[] args) 
	{
		Map <Integer,String>map=new LinkedHashMap<Integer,String>();
	
		map.put(100, "XYZ");
		map.put(10, "XYZ");
		map.put(100, "XYZh");
		map.put(200, "XYfZ");
		map.put(300, "XYZ");
		
		System.out.println(map);
		
		Set<Integer> keys=map.keySet();
		
		System.out.println(keys);
	
		Collection<String> col=map.values();
//		ArrayList l=(ArrayList)col;
		System.out.println(col);
		
		
	}

}
