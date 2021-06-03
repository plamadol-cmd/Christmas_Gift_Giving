package p_02;

import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {
	private static Random random = new Random();
	
	private GatherSurprises() {
		//The class GatherSurprises can be either abstract or final, not both
		//It is impossible to create instances with a private constructor
	}
	
	public static ISurprise[] gather(int n) {
		ISurprise[] array = new ISurprise[n];
		int randomNum = random.nextInt();
		
		//add n random surprises
		for (int i = 0; i < n; i++) {
			randomNum = random.nextInt();
			randomNum = Math.abs(randomNum % 3);
			
			switch(randomNum) {
				case 0:
					array[i] = new FortuneCookie();
					break;
				case 1:
					array[i] = new Candies();
					break;
				case 2:
					array[i] = new MinionToy();
					break;
			}
		}
		
		return array;
	}
	
	public static ISurprise gather() {
		int randomNum = random.nextInt();
		randomNum = Math.abs(randomNum % 3);
		
		switch(randomNum) {
			case 0:
				return new FortuneCookie();
			case 1:
				return new Candies();		
		}
		
		return new MinionToy();
	}
}
