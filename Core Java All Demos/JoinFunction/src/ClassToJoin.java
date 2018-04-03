
public class ClassToJoin 
{

	public static void main(String[] args) 
	{
		Thread t1=new Thread(new Runnable()
		{	
			@Override
			public void run() 
			{
				for(int i=0;i<10;i++)
				{
					try
					{
						Thread.sleep(1000);
						System.out.println("Hello");
					}
					catch(InterruptedException ie)
					{
						
					}
				}
			}
		});

		Thread t2=new Thread(new Runnable()
		{	
			@Override
			public void run() 
			{
				for(int i=0;i<10;i++)
				{
					try
					{
						Thread.sleep(1000);
						System.out.println("World");
					}
					catch(InterruptedException ie)
					{
						
					}
				}
			}
		});
		
		t1.start();
		
		try 
		{
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After First Thread");

		t2.start();
		try 
		{
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("After Second Thread Hello from main function");
	}
	
}
