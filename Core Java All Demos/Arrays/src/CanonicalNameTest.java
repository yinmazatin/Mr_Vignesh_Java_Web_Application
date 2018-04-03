
public class CanonicalNameTest
{
	public static String str="Hello";
	public static void main(String[] args) 
	{
		System.out.println(str.getClass().getName());
		System.out.println(str.getClass().getCanonicalName());

	}
}
