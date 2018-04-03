import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class BRDemo
{
	public static void main(String[] args) 
	{
		char ch[]=new char[300]; 
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\ADMIN\\Desktop\\hello.txt"));
//			br.read(ch);
//			System.out.println(ch);
			int c;
			while((c=br.read())!=-1)
			{
				System.out.print((char)c);
			}
			br.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
