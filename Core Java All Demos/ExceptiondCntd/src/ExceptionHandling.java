import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ExceptionHandling 
{
	
	public static void openFile(String path) throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream(path);
		System.out.println("Success...");
	}
	public static void calOpenFile() throws FileNotFoundException
	{
		openFile("C:\\Users\\ADMIN\\Desktop\\hello.txt");
	}
	public static void main(String[] args) 
	{
		try {
			calOpenFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
		}
	}

}
