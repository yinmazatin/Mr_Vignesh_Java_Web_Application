import java.util.Scanner;


public class RuntimeExcpCass 
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a & b : ");
		a=s.nextInt();
		b=s.nextInt();
		try
		{
			c=a/b;
			System.out.println("After division");
			System.out.println("Answer = "+c);

		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		
	}
}
