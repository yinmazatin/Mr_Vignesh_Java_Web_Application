import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
public class DOSDemo 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileOutputStream fos=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\hello.txt");
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			DataOutputStream dos=new DataOutputStream(bos);
			
			byte b[]=new String("Hello world....").getBytes();
			dos.write(b);
			dos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
