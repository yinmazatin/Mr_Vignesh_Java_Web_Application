import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FWDemo 
{
	public static void main(String[] args) 
	{
		char ch[]=new char[300];
		Scanner s=new Scanner(System.in);
		try 
		{
			FileWriter fw=new FileWriter("C:\\Users\\ADMIN\\Desktop\\hello.txt");
			System.out.println("Enter a text...");
			
			String txt=s.next();
			ch=txt.toCharArray();
			fw.write(ch);
			fw.close();
		
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
