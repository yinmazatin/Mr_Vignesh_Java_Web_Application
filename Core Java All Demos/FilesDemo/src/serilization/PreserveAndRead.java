package serilization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PreserveAndRead
{
	public static void main(String[] args) 
	{
		Student s1=new Student(100, "ABC");
		
		try
		{
			FileOutputStream fos=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\stud.bin");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			oos.writeObject(s1);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
