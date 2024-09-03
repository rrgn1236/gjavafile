package Filewritter4;

public class test
 {
	
	public static void main(String[] args)
	{
		
	
	     Studentpojo1 std = new Studentpojo1();
	     	std.Setsid(1);
	     	std.Setsname("Rajagopal");
	     	std.Setsage(24);
	     	std.Setsmks(67.78);
	     	std.Setsqul("B.Tech");
	     	
	     	stdcontroller sq = new stdcontroller();
	     	sq.Writting(std);
	}
	
 }
