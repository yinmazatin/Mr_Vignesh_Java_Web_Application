package pack2;

import pack1.*;


public class ClassOutSidePack1 extends BaseClass
{
	public static void main(String[] args) 
	{
		ClassOutSidePack1 cs=new ClassOutSidePack1();
		
		System.out.println(cs.pubVar);
		System.out.println(cs.proVar);
		System.out.println(cs.priVar);
		System.out.println(cs.defVar);

	}
}
