import java.io.File;


public class ListingFiles 
{
	public static void main(String[] args) 
	{
		File folder=new File("K:\\test");
		
		if(folder.exists())
		{
			File f[]=folder.listFiles();
		
			for(int i=0;i<f.length;i++)
			{
				System.out.println(f[i].getName());
			}
		}
	}
}
