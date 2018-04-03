
public class WaitAndNotify 
{
	int goods;
	public synchronized void producer()
	{
		for(int i=0;i<10;i++)
			goods++;
		
		System.out.println("Hello from Producer");
		try
		{
			wait();
		} catch (InterruptedException e) 
		{
		}
		
		System.out.println("After Wait... Hello from producer");
	}
	
	public synchronized void consumer()
	{
		for(int i=0;i<10;i++)
			goods--;
		
		try 
		{
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		notify();
		
		System.out.println("After Notify... Hello from Consumer");
	
	}
	public static void main(String[] args) 
	{
		WaitAndNotify wn=new WaitAndNotify();
		new Thread(new Runnable()
 
		{	
			@Override
			public void run() 
			{
				wn.producer();
			}
		}).start();

		new Thread(new Runnable()
		 
		{	
			@Override
			public void run() 
			{
				wn.consumer();
			}
		}).start();

	}

}
