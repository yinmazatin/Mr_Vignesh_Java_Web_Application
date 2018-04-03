package pack1;

public class ChildSamePack extends BaseClass
{
	public static void main(String[] args) 
	{
		ChildSamePack cs=new ChildSamePack();
		
		System.out.println(cs.pubVar);
		System.out.println(cs.proVar);
		System.out.println(cs.priVar);
		System.out.println(cs.defVar);
	}
}
