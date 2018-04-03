import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class BufferedInputStreamDemo
{
	public static void main(String[] args) 
	{
		byte b[]=new byte[300];
		try 
		{
			FileInputStream fis=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\hello.txt");
			BufferedInputStream bis=new BufferedInputStream(fis);
			DataInputStream dis=new DataInputStream(bis);
//			bis.read(b);
			
			dis.read(b);
			String str=new String(b);
			System.out.println(str.trim());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
