package com.interface1;

public class user
{
	public static void main(String[] args)
	{
		hp h = new hp();
		h.mouse();
		h.keyboard();
		h.display();
		h.audio();
		System.out.println("----------");
		
		dull d = new dull();
		d.audio();
		d.display();
		d.finger();
		d.keyboard();
		d.mouse();
		System.out.println("----------------");
		apple a = new apple();
		a.audio();
		a.display();
		a.keyboard();
		a.logo();
		a.mouse();
		System.out.println("--------------");
		acer ac = new acer();
		ac.audio();
		ac.display();
		ac.keyboard();
		ac.mouse();
		ac.sensor();
		System.out.println("---------------");
		laptop.m1();
		ac.m2();
		laptop.m1();
		laptop.m4();
		ac.m5();
		
	}

}
