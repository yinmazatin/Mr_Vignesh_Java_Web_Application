import java.io.FileNotFoundException;
import java.io.FileReader;


public class FRDemo 
{
	public static void main(String[] args) 
	{
		char ch[]=new char[300];
		try 
		{
			FileReader fr=new FileReader("C:\\Users\\ADMIN\\Desktop\\hello.txt");
			
			fr.read(ch);
//			String n=new String(ch);
//			System.out.println(n);
			System.out.println(ch);
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
