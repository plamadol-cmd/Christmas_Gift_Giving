package p_02;

import java.util.ArrayList;

public class LifoBag implements IBag {
	
	private ArrayList<ISurprise> lifoBag;
	
	public LifoBag() {
		lifoBag = new ArrayList<ISurprise>();
	}
	
	@Override
	public void put(ISurprise newSurprise) {
		if (newSurprise == null) {
			lifoBag.add(GatherSurprises.gather());
		} else {
			lifoBag.add(newSurprise);
			System.out.println(newSurprise.toString() + " added");
		}
	}

	@Override
	public void put(IBag bagOfSurprises) {
		int n = bagOfSurprises.size();
		for (int i = 0; i < n; i++) {
			this.put(bagOfSurprises.takeOut());
		}
		
	}
	
	@Override
	public void put() {
		ISurprise newSurprise = GatherSurprises.gather();
		lifoBag.add(newSurprise);
		System.out.println(newSurprise.toString() + " added");
	}
	
	@Override
	public ISurprise takeOut() {
		if (this.isEmpty()) {
			System.out.println("The bag is empty");
			return null;
		}
		int takeOutIndex = lifoBag.size() - 1;
		ISurprise surprise = lifoBag.get(takeOutIndex);
		lifoBag.remove(takeOutIndex);
		return surprise;
	}

	@Override
	public boolean isEmpty() {
		if (this.lifoBag.size() == 0 || lifoBag == null) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return this.lifoBag.size();
	}

	

}
