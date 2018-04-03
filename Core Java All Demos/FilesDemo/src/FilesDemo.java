import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilesDemo 
{
	public static void main(String[] args)
	{
		File file=new File("k:\\test\\hlo");
		
		if(file.exists())
		{
			System.out.println("Exists...");
		}
		else
		{
			System.out.println("NA Press 1 to create a new file ");
			int i=new Scanner(System.in).nextInt();
			try 
			{
				if(i==1)
				{
					file.createNewFile();
					System.out.println("File Created...");
				}
				
			} catch (IOException e)
			{
				System.out.println("Failed to create the file");
			}
		}
	}

}
