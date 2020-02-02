package csci6534;

public class RAM {

	private int[] memory = new int[2048];

	private int nextAvailableAddress;

	// No-args constructor
	public RAM() {
		// Pg. 5: First 5 memory addresses are reserved
		nextAvailableAddress = 6;
	}

	// My first simple ROM loader. This just loads the number 5 into a spot in
	// memory
	public boolean loadOneIntoRAM() {
		memory[19] = 5;

		return true;
	}

	// This method deposits and instruction into RAM at location specific by the
	// address passed in.
	public boolean depositInstruction(int instruction) {
		memory[nextAvailableAddress] = instruction;
		nextAvailableAddress++;
		return true;
	}

}
