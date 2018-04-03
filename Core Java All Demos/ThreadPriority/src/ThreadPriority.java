
public class ThreadPriority 
{

	public static void main(String[] args) 
	{
		Thread t1=new Thread(new Runnable()
 
		{	
			@Override
			public void run() 
			{
				System.out.println("Hello from "+Thread.currentThread().getPriority());
			}
		});
		
		t1.setName("Van Date Thread");
		
		Thread t2=new Thread(new Runnable() 
		{	
			@Override
			public void run() 
			{
				System.out.println("Hello from "+Thread.currentThread().getPriority());
				System.out.println("Hello");
			}
		});
		
		t2.setName("Sany Sak Thread");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t2.start();
		try
		{
			t2.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.stop();
	}

}
