package csci6534;

public class RAM {

	private int[] memory = new int[2048];

	// No-args constructor
	public RAM() {

	}

	// My first simple ROM loader. This just loads the number 5 into a spot in
	// memory
	public boolean loadOneIntoRAM() {
		memory[19] = 5;

		return true;
	}

	// This method deposits and instruction into RAM at location specific by the
	// address passed in.
	public boolean depositInstruction(int address, int instruction) {
		memory[address] = instruction;
		return true;
	}

	public int retrieve(int address) {
		return memory[address];
	}

}
