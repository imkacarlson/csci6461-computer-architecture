package csci6534;

public class KAC {

	private RAM KACRam;
	private CPU KACCPU;

	private int nextAvailableAddress;

	private RegisterTransfer registerTransfer = new RegisterTransfer();

	public KAC() {
		this.KACRam = new RAM();
		this.KACCPU = new CPU();

		// Pg. 5: First 5 memory addresses are reserved
		nextAvailableAddress = 6;
	}

	// This method deposits a instruction into RAM
	public boolean depositInstruction(int instruction) {
		this.KACCPU.setMBR(instruction);
		this.KACCPU.setMAR(nextAvailableAddress);

		nextAvailableAddress++;

		return this.KACRam.depositInstruction(this.KACCPU.getMAR(), this.KACCPU.getMBR());
	}

	// This method just loads a program into RAM from ROM
	public boolean loadROM() {
		this.KACRam.loadOneIntoRAM();

		return true;
	}

	public RegisterTransfer executeProgram() {
		this.KACCPU.setMAR(6); // Since 6 is where our first instruction is

		do {
			// Get instruction from RAM at address dictated by the value in the MAR and put
			// the word retrieved from RAM into MBR
			this.KACCPU.setMBR(this.KACRam.retrieve(this.KACCPU.getMAR()));

			// Get Opcode of instruction. Doing this by shifting and then masking
			int opcode = (this.KACCPU.getMBR() >> 10) & 63;

			switch (opcode) {
			case 1:
				int generalPurposeRegisterToLoadInto = (this.KACCPU.getMBR() >> 8) & 3;
				int addressToLoadFrom = this.KACCPU.getMBR() & 31;

				registerTransfer.storeIntoGeneralPurposeRegister(generalPurposeRegisterToLoadInto,
						this.KACRam.retrieve(addressToLoadFrom));
				break;
			default:
				System.out.println("In default of switch statement in KAC.java");
			}

			this.KACCPU.setMAR(this.KACCPU.getMAR() + 1);

			this.KACCPU.setMBR(this.KACRam.retrieve(this.KACCPU.getMAR()));

		} while (this.KACCPU.getMBR() != 0);

		return registerTransfer;
	}

}
