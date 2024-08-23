package com.interface4;

public class array
{

	public static void main(String[] args)
	{
		int array[] = {1,2,3,4,5};
		int rev[]= new int[array.length];
		
		for (int i =0; i<array.length ; i++)
		{
			int array2=((array.length-1)-i);
			rev[array2]=array[i];
			
		}
		System.out.println("array");
		for(int raj1 : array)
		{
			System.out.print(raj1 + "  ");
		}
		System.out.println("Reverse Array:");
		
		for(int raj :rev)
		{
			System.out.print(raj + "  ");
			
			
		}
		
	
	}
}
