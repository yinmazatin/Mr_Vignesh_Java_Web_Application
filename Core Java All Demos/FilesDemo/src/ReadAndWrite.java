import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class ReadAndWrite
{
	public static void main(String[] args) 
	{
		byte b[]=new byte[300];
		try 
		{
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream("C:\\Users\\ADMIN\\Desktop\\hello.txt"));
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\demo.txt"));
			
			bis.read(b);
			bos.write(b);
			
			bis.close();
			bos.close();
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
