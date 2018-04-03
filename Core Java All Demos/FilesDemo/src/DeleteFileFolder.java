import java.io.File;


public class DeleteFileFolder
{
	public static void main(String[] args) 
	{
		
		File folder=new File("K:\\test");
	
		File f[]=folder.listFiles();

		String path="";
		for(int i=0;i<f.length;i++)
		{
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			f[i].delete();
		}
		folder.delete();
		System.out.println("Folder deleted");
	}

}
