package com.slokam;

public class cal
{
      void add( int m, int n)
      {
    	  int o =m+n;
    	  System.out.println("Adding="+o);
      }
      void devision( int m, int n)
      {
    	  int o=m-n;
    	  System.out.println("Devision="+o);
      }
      void multi(int m , int n)
      {
    	  int o = m +n;
    	  System.out.println("multiplay="+o);
      }
      
      void module(double m , double n)
      {
    	  double o = m/n;
    	  System.out.println("Module ="+o);
      }
      
      
      public static void main(String[] args)
      {
    	  cal k = new cal();
    	  k.add(5, 6);
    	  k.devision(6, 5);
    	  k.multi(4, 5);
    	  k.module(6, 2);
      }
}
