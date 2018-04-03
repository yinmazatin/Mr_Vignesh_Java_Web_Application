package serilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class ReadPreserved
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\stud.bin");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Student s=(Student)ois.readObject();
			
			System.out.println(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
