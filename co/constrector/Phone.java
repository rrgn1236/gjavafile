package co.constrector;

public class Phone
{
	public SIMCard[] simCards;
	
	public  Phone(SIMCard... simCards)
	{
		this.simCards=simCards;
		
	}
	
	void displaySIMCards()
	{
		for(SIMCard simCard:simCards)
		{
			System.out.println(" Number:  "+simCard.number+"  operator: "+simCard.operator);
		}
	}
	
	public static void main(String[] args)
	{
		SIMCard simCard1= new SIMCard("123456","operator1");
		SIMCard simCard2= new SIMCard("65587429","operator2");
		
		Phone phone = new Phone(simCard1,simCard2);
		phone.displaySIMCards();
	}
	

}
