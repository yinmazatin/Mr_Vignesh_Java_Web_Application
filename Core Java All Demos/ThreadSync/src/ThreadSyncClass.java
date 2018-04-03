
public class ThreadSyncClass 
{
	int cnt=0;
	public synchronized void increment()
	{
		cnt++;
	}
	public void countTheValue()
	{
		Thread t1=new Thread(new Runnable()
		{	
			@Override
			public void run() 
			{
				for(int i=0;i<10000;i++)
					increment();
			}
		});
		Thread t2=new Thread(new Runnable()
		{	
			@Override
			public void run() 
			{
				for(int i=0;i<10000;i++)
					increment();
			}
		});
		
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}
		catch(InterruptedException ie)
		{
			
		}
		System.out.println(cnt);
	}
	public static void main(String[] args) 
	{
		ThreadSyncClass tsc=new ThreadSyncClass();
		tsc.countTheValue();
	}

}
