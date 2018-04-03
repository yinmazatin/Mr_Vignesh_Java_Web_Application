import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileNotFoundDemo 
{
	public static void main(String[] args) 
	{
		byte b[]=new byte[200];
		try
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\hello.txt");
			System.out.println("Success... File opened");
			fis.read(b);
		} catch (FileNotFoundException e) 
		{
			System.out.println("Exception occurred "+e.getMessage());
		}
		catch(IOException ioe)
		{
			System.out.println("Not able to read from the file");
		}
	}
}
