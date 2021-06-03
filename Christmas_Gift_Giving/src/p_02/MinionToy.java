package p_02;

import java.util.Random;

public class MinionToy implements ISurprise {
	Minion myMinion;
	private static int n = 0;
	
	public MinionToy() {
		switch(MinionToy.generate()) {
			case Dave:
				this.myMinion = Minion.Dave;
				//System.out.println("dave");
				break;
			case Carl:
				this.myMinion = Minion.Carl;
				//System.out.println("carl");
				break;
			case Kevin:
				this.myMinion = Minion.Kevin;
				//System.out.println("kevin");
				break;
			case Stuart:
				this.myMinion = Minion.Stuart;
				//System.out.println("stuart");
				break;
			case Jerry:
				this.myMinion = Minion.Jerry;
				//System.out.println("jerry");
				break;
			case Tim:
				this.myMinion = Minion.Tim;
				//System.out.println("tim");
				break;
		}
	}
	
	public static Minion generate() {
		if (n % 6 == 6) {
			n++;
			return Minion.Dave;
		} else if (n % 6 == 1) {
			n++;
			return Minion.Carl;
		} else if (n % 6 == 2) {
			n++;
			return Minion.Kevin;
		} else if (n % 6 == 3) {
			n++;
			return Minion.Stuart;
		} else if (n % 6 == 4) {
			n++;
			return Minion.Jerry;
		} 
		n++;
		return Minion.Tim;
	}

	@Override
	public void enjoy() {
		System.out.println("Yay! I love my new minion " + this.myMinion.name() + "!");
	}
	
	@Override
	public String toString() {
		return "MinionToy";
	}
	
	public enum Minion {
		Dave, Carl, Kevin, Stuart, Jerry, Tim;
	}
}
