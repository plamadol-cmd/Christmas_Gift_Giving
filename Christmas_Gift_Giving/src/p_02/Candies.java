package p_02;

import java.util.Random;

public class Candies implements ISurprise {
	private int numberOfCandies;
	private Candy candyType;
	static Random random = new Random();
	private static int n;
	private static int m;
	
	public Candies() {
		Candies.generate();
		this.numberOfCandies = 15 + n;
		if (m % 4 == 0) {
			this.candyType = Candy.chocolate;
		} else if (m % 4 == 1) {
			this.candyType = Candy.jelly;
		} else if (m % 4 == 2) {
			this.candyType = Candy.fruits;
		} else if (m % 4 == 3) {
			this.candyType = Candy.vanilla;
		}
		
	}
	
	public static void generate() {
		// number of candies
		Candies.n = random.nextInt();
		n = Math.abs(n) % 6;
		// candy type
		Candies.m = random.nextInt();
		m = Math.abs(m) % 4;
	}

	@Override
	public void enjoy() {
		String output = String.format("Wow! I received %d %s candies!", 
				this.numberOfCandies, this.candyType.name());
		System.out.println(output);
	}
	
	@Override
	public String toString() {
		return "Candy";
	}
	
	public enum Candy {
		chocolate, jelly, fruits, vanilla;
	}
	
}
