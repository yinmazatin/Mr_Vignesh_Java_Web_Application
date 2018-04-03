package pack1;

public class BaseClass
{
	public String pubVar="Public Variable";
	protected String proVar="Protected Variable";
	private String priVar="Private Variable";
	String defVar="Default Variable";
	
	
	public void localFunction()
	{
		System.out.println(pubVar);
		System.out.println(proVar);
		System.out.println(priVar);
		System.out.println(defVar);

	}
	
	public static void main(String[] args) 
	{
		BaseClass bc=new BaseClass();
		
		bc.localFunction();
	}
}
