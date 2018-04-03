
public class ExtendingThreadClass extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Hello from Run");
	}
	public static void main(String[] args)
	{
		ExtendingThreadClass et1=new ExtendingThreadClass();
		ExtendingThreadClass et2=new ExtendingThreadClass();
		ExtendingThreadClass et3=new ExtendingThreadClass();

		et1.start();
		et2.start();
		et3.start();
	}
}
