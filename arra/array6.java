package arra;

public class array6 {

	public static void main(String[] args) 
	{
           String[] sub= {"Hindi","Telugu","English","Maths","Science","Social"};
           int [] marks= {67,87,77,98,56,57};
           double tmarks=0;
           for(int i=0; i<marks.length-1; i=i+1)
           {
        	   System.out.println(sub[i]+"=="+marks[i]);
        	   tmarks=tmarks+marks[i];        	   
           }
           System.out.println("Total marks="+tmarks);
           double per=tmarks/(marks.length);
           System.out.println("The percentage="+per);
           

	}

}
