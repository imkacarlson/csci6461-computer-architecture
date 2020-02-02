package csci6534;

public class CPU {

	// Pg. 4 of project description calls for 4 general purpose register
	// and 3 index registers
	private int[] generalPurposeRegisters = new int[3];
	private int[] indexRegisters = new int[2];

	// Memory Buffer Register (Pg. 4)
	private int MBR;

	// Memory Address Register (Pg. 5)
	private int MAR;

	// No-args constructor
	public CPU() {

	}
}
