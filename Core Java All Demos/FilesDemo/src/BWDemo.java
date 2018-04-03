import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BWDemo 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		try 
		{
			FileWriter fw=new FileWriter("C:\\Users\\ADMIN\\Desktop\\hello.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			
			System.out.println("ENter a text : ");
			String str=s.next();
			
			char ch[]=str.toCharArray();
			bw.write(ch);
			
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
