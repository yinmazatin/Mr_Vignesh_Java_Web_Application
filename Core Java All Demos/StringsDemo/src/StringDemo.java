import java.util.Scanner;

public class StringDemo 
{
	public static void main(String[] args) 
	{
		String userName,pass;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter user name and password : ");
		userName=s.next();
		System.out.println("Enter password : ");
		pass=s.next();
	
		if(userName.equals(new String("Makara"))&&pass.equals("1234"))
		{
			System.out.println("Login Success... Welcome "+userName);
			char ch[]=userName.toCharArray();
			System.out.println(ch[0]);
			System.out.println(ch[1]);
			System.out.println(ch[2]);
		
		}
	}
}
