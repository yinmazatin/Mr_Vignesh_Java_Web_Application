import java.util.Scanner;


public class IfAndElseExample 
{
	int age=0;
	
	public static void main(String[] args) 
	{
		IfAndElseExample ie=new IfAndElseExample();
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		ie.age=s.nextInt();
		if(ie.age>=18)
		{
			System.out.println("You can vote");
		}
		
		else
		{
			System.out.println("Sorry you are not an adult");
		}
	}
}
