import java.util.Scanner;


public class TwoDArrays
{

	public static void main(String[] args) 
	{
		int a[][]=new int[3][3];
		
		System.out.println("Enter the array elements");
		
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]);
			}
		}

	}

}
