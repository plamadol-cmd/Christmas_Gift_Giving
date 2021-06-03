package p_02;

import java.util.ArrayList;
import java.util.Random;

public class RandomBag implements IBag {

	private ArrayList<ISurprise> randomBag;
	private int addIndex;
	private static Random random = new Random();
	
	public RandomBag() {
		randomBag = new ArrayList<ISurprise>();
	}
	
	@Override
	public void put(ISurprise newSurprise) {
		if (newSurprise == null) {
			System.out.println("The surprise is null.");
		} else {
			if (this.randomBag.size() < 2) {
				randomBag.add(newSurprise);
			} else {
				addIndex = random.nextInt();
				addIndex = Math.abs(addIndex % this.randomBag.size() - 1);
				randomBag.add(addIndex, newSurprise);
			}
			System.out.println(newSurprise.toString() + " added");
		}
		
	}
	
	public void put() {
		ISurprise newSurprise = GatherSurprises.gather();
		randomBag.add(newSurprise);
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
			ISurprise surprise = randomBag.get(0);
			randomBag.remove(0);
			return surprise;
		}
	}

	@Override
	public boolean isEmpty() {
		if (this.randomBag.size() == 0 || randomBag == null) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return this.randomBag.size();
	}

}
