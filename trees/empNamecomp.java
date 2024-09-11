package trees;

import java.util.Comparator;

public class empNamecomp implements Comparator<employe>
{

	@Override
	public int compare(employe e1, employe e2)
	{
		
		return e1.getename().compareTo(e2.getename());
	}

}
