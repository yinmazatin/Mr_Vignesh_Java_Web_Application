import java.util.Scanner;


public class VolatileClass extends Thread
{
	volatile boolean status=true;
	
	@Override
	public void run()
	{
		while(status)
		{
			try 
			{
				Thread.sleep(1000);
				System.out.println("Hello");

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void stopTheLoop()
	{
		status=false;
	}
	public static void main(String[] args)
	{
		VolatileClass vc=new VolatileClass();
		vc.start();
		
		System.out.println("Enter any character to stop : ");
		new Scanner(System.in).next().charAt(0);
		vc.stopTheLoop();
	}

}
