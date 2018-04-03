
public class ExampleClass
{
	static String school;
	String name;
	
	public static void main(String[] args)
	{
		ExampleClass ec1=new ExampleClass();
		ExampleClass ec2=new ExampleClass();

		ec1.name="Kim";
		ec2.name="Tola";
		
		ec1.school="KIT";
		ec2.school="Kirirom Institute of Technology";
		
		System.out.println(ec1.name);
		System.out.println(ec2.name);
	
		System.out.println(ec1.school);
		System.out.println(ec2.school);
	}
}
