package p_02;

import java.util.ArrayList;

public class FifoBag implements IBag {
	//private int takeOutIndex = 0;
	private ArrayList<ISurprise> fifoBag;
	
	public FifoBag() {
		fifoBag = new ArrayList<ISurprise>();
	}
	
	@Override
	public void put(ISurprise newSurprise) {
		if (newSurprise == null) {
			System.out.println("The surprise is null.");
		} else {
			fifoBag.add(newSurprise);
			System.out.println(newSurprise.toString() + " added");
		}
		
	}
	
	public void put() {
		ISurprise newSurprise = GatherSurprises.gather();
		fifoBag.add(newSurprise);
		System.out.println(newSurprise.toString() + " added");
	}

	@Override
	public void put(IBag bagOfSurprises) {
		int n = bagOfSurprises.size();
		for (int i = 0; i < n; i++) {
			this.put(bagOfSurprises.takeOut());
		}
		
	}

	@Override
	public ISurprise takeOut() {
		if (this.isEmpty()) {
			System.out.println("The bag is empty");
			return null;
		} else {
			ISurprise surprise = fifoBag.get(0);
			fifoBag.remove(0);
			return surprise;
		}
	}

	@Override
	public boolean isEmpty() {
		if (this.fifoBag.size() == 0 || fifoBag == null) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return this.fifoBag.size();
	}

}
