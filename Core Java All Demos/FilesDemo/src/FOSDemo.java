import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FOSDemo 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		try 
		{
			FileOutputStream fos=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\demo.txt");
			System.out.println("Enter your name : ");
			String name=s.nextLine();
			
			byte []b=name.getBytes();
			fos.write(b);
			System.out.println("Success...");
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
