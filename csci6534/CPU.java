package csci6534;

public class CPU {

	// Pg. 4 of project description calls for 4 general purpose register
	// and 3 index registers
	private int[] generalPurposeRegisters = new int[3];
	private int[] indexRegisters = new int[2];

	// Memory Buffer Register (Pg. 4)
	private int MBR;

	// No-args constructor
	public CPU() {
		// Pg. 5: First 5 memory addresses are reserved
		this.MBR = 6;
	}

	public int getMBR() {
		return this.MBR;
	}
}
