import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadingUsingDIS 
{
	public static void main(String[] args) 
	{
		byte b[]=new byte[300];
		try 
		{
			DataInputStream dis=new DataInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\ADMIN\\Desktop\\hello.txt")));
			dis.read(b);
			
			System.out.println(new String(b).trim());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
