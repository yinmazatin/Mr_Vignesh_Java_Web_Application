import java.util.Scanner;


public class LinearSearch
{
	public static int BSearch(int a[],int ele, int s)
	{
		int pos=-1,beg=0,mid=0,end=s-1;
		
		int i=0;
		
		while(i<s)
		{
			mid=(beg+end)/2;
			if(ele==a[mid])
			{
				pos=mid;
				return mid;
			}
			else if(ele>a[mid])
			{
				beg=mid+1;
			}
			else
			{
				end=mid-1;
			}
			i++;
		}
		return pos;
	}
	public static void main(String[] args) 
	{
		int a[]=new int[35],size,ele,pos;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		size=s.nextInt();
		
		System.out.println("Enter the array elements : ");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter the element to be found : ");
		ele=s.nextInt();
		
		pos=BSearch(a, ele, size);
		
		if(pos==-1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("ELement found at "+pos);
		}
	}

}
