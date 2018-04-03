import java.util.Scanner;


public class OneDArrays 
{

	public static void main(String[] args)
	{
		int a[]=new int[5];
		
		System.out.println("Enter values for the array elements :");
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("The array elements are : ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		
	}

}
