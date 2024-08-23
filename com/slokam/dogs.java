package com.slokam;

public class dogs
{

	public static void main(String[] args)
	{
		dog jummy=new dog();
		jummy.color="Black";
		jummy.Tailmoving=true;
        System.out.println(jummy.color);
        System.out.println(jummy.Tailmoving); 
        jummy.dancing();
        System.out.println("-----------------------------");
         
        dog snuppy=new dog();
        snuppy.color="Brown";
        snuppy.Tailmoving=false;
        System.out.println(snuppy.color);
        System.out.println(snuppy.Tailmoving);
        snuppy.dancing();
        snuppy.Food();
        snuppy.Shout();
        
        System.out.println("---------------------------------");
        
        dog Rocky = new dog();
        Rocky.color="White";
        Rocky.Tailmoving=false;
        System.out.println(Rocky.color);
        System.out.println(Rocky.Tailmoving);
        Rocky.dancing();
        Rocky.Food();
        Rocky.Shout();
        System.out.println("-------------------------------------");
        		
        
        
	}

}
