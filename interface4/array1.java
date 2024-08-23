package com.interface4;

public class array1
{
	public static void main(String[] args)
	{
		// Step:1 //
		int array[]= {1,2,3,4,5};
		//Step:2 //
		int rev[] = new int[array.length];
		// Step:3 //
		for(int index = 0; index <array.length; index ++)
		{
			//step:4 //
			int rev2 = (array.length-1)-index;
			rev[rev2]=array[index];
			System.out.print(index);
		}
		System.out.println("-------------");
		
		// Step: 5 //
		for(int i: rev)
		{
			System.out.print(i +"  ");
		}
		
		
	}

}
