
public class ChildClass extends Integer
{
	@Override
	public void sayHello()
	{
		System.out.println("Hello from child"+a);
	}
	public static void main(String[] args) 
	{
		BaseClass cc=new BaseClass();
		
		cc.sayHello();
	}
}
