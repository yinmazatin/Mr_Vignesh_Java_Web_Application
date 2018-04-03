public class NullPointerExcpDemp 
{
	public static void callSayHello(Dummy d)
	{
		try
		{
			d.sayHello();
		}
		catch(NullPointerException ne)
		{
			System.out.println("You Fraud");
		}
		
	}
	public static void main(String[] args) 
	{
		Dummy d=new Dummy();
		callSayHello(d);
	}
}
