package p_02;

public interface IBag {
	// adds a surprise in the bag
	void put(ISurprise newSurprise);
	 
	// adds all the surprises from another IBag
	//   -> the 'bagOfSurprises' will be empty() afterwards
	void put(IBag bagOfSurprises);
	
	//add random gift
	void put();
	 
	// removes a surprise from the bag and returns it
	ISurprise takeOut();
	 
	// Checks if the bag is empty or not
	boolean isEmpty();
	 
	// Returns the number of surprises
	int size();

	
}
