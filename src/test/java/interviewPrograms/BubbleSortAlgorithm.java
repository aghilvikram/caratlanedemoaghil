package interviewPrograms;

public class BubbleSortAlgorithm 
{

	public static void main(String[] args) 
	{
		int num[]= {6,5,2,8,9,4};
		int size=num.length;
		System.out.println("before sorting");
		for(int n:num)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		int temp=0;
		for(int i=0; i<size; i++)
		{
			for(int j=0; j<size-i-1; j++) 
			{
				if(num[j]>num[j+1])
				{
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
			for(int n:num) 
			{
				System.out.print(n+" ");
				
			}
			System.out.println();
			
		}
		System.out.println();
		
		System.out.println("After sorting");
		for(int n:num) 
		{
			System.out.print(n+" ");
		}
		System.out.println();
		
		for(int k=0; k<num.length; k++) 
		{
			if(k==num.length-2)
				System.out.println("the second largest number in array is:"+num[k]);
			//System.out.println(num[k]);
		}

	}

}
