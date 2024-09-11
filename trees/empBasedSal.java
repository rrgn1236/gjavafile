package trees;

import java.util.Comparator;

public class empBasedSal implements Comparator<employe>
{


	@Override
	public int compare(employe e1, employe e2)
	{
		
		return e1.getesal().compareTo(e2.getesal());
	}

	

}
