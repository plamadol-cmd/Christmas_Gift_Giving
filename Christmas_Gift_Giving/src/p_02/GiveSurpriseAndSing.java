package p_02;

public class GiveSurpriseAndSing extends AbstractGiveSurprises {

	public GiveSurpriseAndSing(String containerType, int waitTime) {
		super(containerType, waitTime);
	}

	@Override
	void giveWithPassion() {
		System.out.println("Singing a nice song, full of joy and genuine excitement�");
		
	}

}
