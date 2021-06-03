package p_02;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {

	public GiveSurpriseAndHug(String containerType, int waitTime) {
		super(containerType, waitTime);
	}

	@Override
	void giveWithPassion() {
		System.out.println("Warm wishes and a big hug!");
		
	}

}
