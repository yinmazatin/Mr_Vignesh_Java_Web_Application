import java.util.Scanner;


public class MergeSort 
{
	public static void main(String[] args) 
	{
		int a[]=new int[30];
		int b[]=new int[30];
		int c[]=new int[60];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array a : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=s.nextInt();
		}
		
		for(int i=0,j=0,k=0;i<(a.length+b.length) ;)
		{
			c[i++]=a[j++];
			c[((a.length+b.length)-i)]=b[k++];
		}
	}
}
