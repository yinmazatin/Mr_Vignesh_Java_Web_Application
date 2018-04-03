
public class ChildClass implements Inter1,Inter2 
{

	
	
	
	public static void main(String[] args) 
	{
		Inter1 in1=new ChildClass();
		Inter2 in2=new ChildClass();
		
		in1.demo3();
		in1.demo4();
		//in1.demo1();
		in2.demo1();
		in2.demo1();
	}

	@Override
	public void demo1() 
	{
		System.out.println("Demo 1");
	}

	@Override
	public void demo2() 
	{
		System.out.println("Demo 2");
	}

	@Override
	public void demo3() 
	{
		System.out.println("Demo 3");
	}

	@Override
	public void demo4() 
	{
		System.out.println("Demo 4");
	}
}
