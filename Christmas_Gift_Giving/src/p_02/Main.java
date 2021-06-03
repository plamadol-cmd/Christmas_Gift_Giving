package p_02;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static AbstractGiveSurprises createContainer() {
		AbstractGiveSurprises giveSurprises;
		String containerType;
		int surpriseType, action, waitTime;
		
		System.out.println("\n\tEnter the type of the container:\n"
				+ "\n- FIFO"
				+ "\n- LIFO"
				+ "\n- RANDOM");
		containerType = sc.next().toUpperCase();
		
		while(!containerType.equals("FIFO") && !containerType.equals("LIFO") &&
				!containerType.equals("RANDOM")) {
			System.out.println("Undefined instruction. Retype:");
			containerType = sc.next();
		}
		
		System.out.println("\n\tSet the waiting time(seconds):");
		waitTime = sc.nextInt();
		
		System.out.println("\tChoose your action after giving gifts:\n"
				+ "\n1. Give surprise and applause"
				+ "\n2. Give surprise and sing"
				+ "\n3. Give surprise and hug");
		action = sc.nextInt();
		while(action != 1 && action != 2 && action != 3) {
			System.out.println("Undefined instruction. Retype:");
			action = sc.nextInt();
		}
		
		switch(action) {
			case 1:
				GiveSurpriseAndApplause gsaa = new GiveSurpriseAndApplause(containerType, waitTime);
				giveSurprises = gsaa;
				break;
			case 2:
				GiveSurpriseAndSing gsas = new GiveSurpriseAndSing(containerType, waitTime);
				giveSurprises = gsas;
				break;
			default:
				GiveSurpriseAndHug gsah = new GiveSurpriseAndHug(containerType, waitTime);
				giveSurprises = gsah;
				break;
		}
		
		System.out.println("\n\tAdd surprises:"
				+ "\n1. Fortune Cookie"
				+ "\n2. Candies"
				+ "\n3. Minion Toy"
				+ "\n4. Random"
				+ "\n5. Stop");
		surpriseType = sc.nextInt();
		while(surpriseType != 5) {
			while(surpriseType != 1 && surpriseType != 2 && surpriseType != 3 &&
					surpriseType != 4 && surpriseType != 5) {
				System.out.println("Undefined instruction. Retype:");
			}
			switch (surpriseType) {
				case 1:
					giveSurprises.put(new FortuneCookie());
					//System.out.println("Fortune Cookie added!");
					break;
				case 2:
					giveSurprises.put(new Candies());
					//System.out.println("Candy added!");
					break;
				case 3:
					giveSurprises.put(new MinionToy());
					//System.out.println("Minion Toy added!");
					break;
				case 4:
					giveSurprises.put();
					//System.out.println("Random gift added!");
					break;
			}
		surpriseType = sc.nextInt();
		}
		
		return giveSurprises;
	}
	
	public static void main(String[] args) {
		//BagFactory myBagFactory = BagFactory.getBagFactory();
		
		AbstractGiveSurprises giveSurprises;
		AbstractGiveSurprises giveSurprisesLifo;
		IBag fifoContainer;

		
		System.out.println("\n\tWelcome to Christmas Gift Giving!");
		System.out.println("\n=================================================\n");
		
		System.out.println("\tFirst container");
		giveSurprises = createContainer();
		System.out.println("\n\tGive a suprise!:");
		giveSurprises.give();
		System.out.println("\n\tGive all surprises!:");
		giveSurprises.giveAll();
		System.out.println("\n=================================================\n");
		
		System.out.println("\n\tSecond container");
		giveSurprises = createContainer();
		System.out.println("\n\tGive all surprises!:");
		giveSurprises.giveAll();
		System.out.println("\n=================================================\n");
		
		System.out.println("\n\tThird container");
		giveSurprises = createContainer();
		System.out.println("\n\tGive all surprises!:");
		giveSurprises.giveAll();
		System.out.println("\n=================================================\n");
		
		System.out.println("e\tCreate a FIFO container and add gifts\n");
		fifoContainer = new FifoBag();
		fifoContainer.put(new FortuneCookie());
		fifoContainer.put(new FortuneCookie());
		fifoContainer.put(new Candies());
		fifoContainer.put(new Candies());
		fifoContainer.put(new MinionToy());
		fifoContainer.put(new MinionToy());
		
		System.out.println("\n\tCreate an empty LIFO container\n");
		giveSurprisesLifo = new GiveSurpriseAndApplause("LIFO", 1);
		System.out.println("\n\tMove suprises from FIFO to LIFO and give them:\n");
		giveSurprisesLifo.put(fifoContainer);
		System.out.println("\n\tGive surprises from LIFO bag:\n");
		giveSurprisesLifo.giveAll();
		
		System.out.println("\n=================================================\n");
		
	    }
	

}
