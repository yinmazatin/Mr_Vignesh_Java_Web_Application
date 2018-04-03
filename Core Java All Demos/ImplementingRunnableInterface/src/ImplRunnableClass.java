
public class ImplRunnableClass implements Runnable
{
	@Override
	public void run() 
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Hello from ImplRunnableCLass ");
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) 
	{
		ImplRunnableClass irc=new ImplRunnableClass();
		Thread t1=new Thread(irc);
		
		
	//	irc.start();
		
		
		ANotherClass ac=new ANotherClass();
		Thread t2=new Thread(ac);
	
		Thread t3=new Thread(new Runnable(){
			public void run()
			{
				for(int i=0;i<10;i++)
				{
					try 
					{
						Thread.sleep(1000);
						System.out.println("Hello from Anonymous");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
	}

	
}
