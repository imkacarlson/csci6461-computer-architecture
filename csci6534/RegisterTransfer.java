package csci6534;

public class RegisterTransfer {

	int[] indexRegisters = new int[3];
	int[] generalPurposeRegisters = new int[4];

	public void storeIntoGeneralPurposeRegister(int register, int word) {
		generalPurposeRegisters[register] = word;
	}

}
