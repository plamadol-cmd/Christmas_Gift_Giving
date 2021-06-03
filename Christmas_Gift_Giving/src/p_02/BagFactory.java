package p_02;

public class BagFactory implements IBagFactory {
	private static boolean wasInitialized = false;
	private static BagFactory bag = null;
	
	private BagFactory() {
		
	}
	
	public static BagFactory getBagFactory() { 
		if (!wasInitialized) {
			bag = new BagFactory();
			wasInitialized = true;
		}
		return bag;
	}

	@Override
	public IBag makeBag(String type) {
		switch(type) {
			case "FIFO":
				return new FifoBag();
			case "LIFO":
				return new LifoBag();
			case "RANDOM":
				return new RandomBag();
		}
		return null;
	}
}
