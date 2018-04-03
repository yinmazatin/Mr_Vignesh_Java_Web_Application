import java.util.ArrayList;
import java.util.List;


public class MultiLock
{
	static Object lock1=new Object();
	static Object lock2=new Object();
	
	static ArrayList list1=new ArrayList();
	static ArrayList list2=new ArrayList();

	public static void addList1()
	{
		synchronized (lock1) 
		{
			try 
			{
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list1.add(100);

		}
	}
	
	public static void addList2()
	{
		synchronized (lock2) 
		{
			try 
			{
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			list2.add(200);

		}
	}
	
	public static void process()
	{
		for(int i=0;i<1000;i++)
		{
			addList1();
			addList2();
		}
	}
	public static void main(String[] args) 
	{
		long start=System.currentTimeMillis();
		Thread t1=new Thread(new Runnable()
		{
			public void run()
			{
				process();
			}
		});
		Thread t2=new Thread(new Runnable()
		{
			public void run()
			{
				process();
			}
		});
			
		t1.start();
		t2.start();
		
		try 
		{
			t1.join();
			t2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		long end=System.currentTimeMillis();
		System.out.println("Size of List1 : "+list1.size());
		System.out.println("Size of List2 : "+list2.size());

		System.out.println("Time Taken : "+(end-start));
	}
}
