
public class Child extends ClassA
{
	int rno;
	String name;
	public Child() 
	{
		super(1000,"XYZ");
		this.rno=super.rno;
		this.name=super.name;
		System.out.println("Hello from child class");
	}
	
	public void print()
	{
		System.out.println("Child class");
		super.print();
	}
	public static void main(String[] args) 
	{
		Child ch=new Child();
		ch.print();
	}

}
