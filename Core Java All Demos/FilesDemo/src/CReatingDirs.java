import java.io.File;


public class CReatingDirs
{
	public static void main(String[] args) 
	{
		char ch='A';
		String str="K:\\test\\";
		
		for(int i=0;i<26;i++)
		{
			str+=ch;
			str+="\\";
			ch++;
		}
		File folder=new File(str);
		
		if(folder.exists())
		{
			System.out.println("Exists...");
		}
		else
		{
			folder.mkdirs();
			System.out.println("Folder created///");
		}
	}
}
