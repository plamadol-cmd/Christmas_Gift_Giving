package p_02;

import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
	private IBag mySurpriseBag;
	private int waitTime;
	BagFactory myBagFactory = BagFactory.getBagFactory(); // ?
	
	public AbstractGiveSurprises(String containerType, int waitTime) {
		switch (containerType) {
			case "FIFO":
				this.mySurpriseBag = myBagFactory.makeBag("FIFO");
				break;
			case "LIFO":
				this.mySurpriseBag = myBagFactory.makeBag("LIFO");
				break;
			case "RANDOM":
				this.mySurpriseBag = myBagFactory.makeBag("RANDOM");
				break;
		}
		this.waitTime = waitTime;
	}
	
	void put(ISurprise newSurprise) {
		this.mySurpriseBag.put(newSurprise);
	}
	
	void put(IBag surprises) {
		this.mySurpriseBag.put(surprises);
	}
	
	void put() {
		this.mySurpriseBag.put();
	}
	
	void give() { //ISurprise
		this.mySurpriseBag.takeOut().enjoy();
		System.out.println();
		this.giveWithPassion();
	}
	
	void giveAll() { //IBag
		int a = this.mySurpriseBag.size();
		for (int i = 0; i < a; i++) {
			this.mySurpriseBag.takeOut().enjoy();
			System.out.println("\n" + this.waitTime + " second(s)..\n");
			try {
				  TimeUnit.SECONDS.sleep(this.waitTime);
				} catch (InterruptedException e) {
				  // TODO Auto-generated catch block
				  e.printStackTrace();
				}
		}
		this.giveWithPassion();
	}
	
	boolean isEmpty() {
		if (this.mySurpriseBag.size() == 0 || this.mySurpriseBag == null) {
			return true;
		}
		return false;
	}
	
	abstract void giveWithPassion();
}
