package com.slokam;

public class Strin
{
String[] getname()
{
	String[] g= {"Raju","RAja","Raj","Roshan","Roja","Raje","Rashon"};
	
	return g;
	}
    public static void main(String[] args)
	{
		Strin s = new Strin();
		String[] data= s.getname();
		System.out.println(data);
		System.out.println(data[0]+"--"+data[1]+"---"+data[2]+"---"+data[3]+"----"+data[4]+"----"+data[5]+"----"+data[6]);
		
	}

}
