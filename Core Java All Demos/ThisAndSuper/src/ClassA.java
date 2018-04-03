
public class ClassA 
{
	int rno;
	String name;
	ClassA(int rno,String name)
	{
		this.rno=rno;
		this.name=name;
		System.out.println("Hello from parent class");
	}
	
	public void print()
	{
		System.out.println(rno);
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		ClassA ca=new ClassA(1000, "ABC");
		ca.print();
	}
}
