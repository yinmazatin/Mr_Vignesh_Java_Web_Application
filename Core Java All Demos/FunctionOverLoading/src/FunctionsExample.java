
public class FunctionsExample 
{
	public void demo()
	{
		System.out.println("I'm a default function");
	}
	
	public void demo(int a)
	{
		System.out.println("A function with one arg A = "+a);
	}
	
	public void demo(char ch) 
	{
		System.out.println("A function with char arg Ch = "+ch);
	}
	
	public void demo(int a,char ch)
	{
		System.out.println("A = "+a+" Ch = "+ch);
	}
	
	public static void main(String[] args)
	{
		FunctionsExample fe=new FunctionsExample();
		
		fe.demo();
		fe.demo('A');
		fe.demo(100);
		fe.demo(300, 'J');
	}
}

