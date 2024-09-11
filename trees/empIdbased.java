package trees;

import java.util.Comparator;

public class empIdbased implements Comparator <employe>

{

	@Override
	public int compare(employe e1, employe e2)
	{
		
		return e1.getsid().compareTo(e2.getsid()) ;
	}
	

}
