
public class ThreadCreation1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			try
			{
				Thread.sleep(1000);
				System.out.println("Hello : "+(i+1));

			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
				}
	}
	public static void main(String[] args) 
	{
		ThreadCreation1 t1=new ThreadCreation1();
		Thread t2=new Thread(new AnotherClass());
		ThreadCreation1 t3=new ThreadCreation1();

		t1.start();
		t2.start();
		t3.start();
	}

}


