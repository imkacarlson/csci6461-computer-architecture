package csci6534;

public class RAM {
	
	private int[] memory = new int[2048];
	
	// No-args constructor
	public RAM () {
		
	}
	
	// My first simple ROM loader. This just loads the number 5 into a spot in memory
	public boolean loadOneIntoRAM() {
		memory[19] = 5;
		
		return true;
	}

}
