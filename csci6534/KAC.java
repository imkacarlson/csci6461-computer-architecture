package csci6534;

public class KAC {

	private RAM KACRam;
	private CPU KACCPU;

	public KAC() {
		this.KACRam = new RAM();
		this.KACCPU = new CPU();
	}

	// This method deposits a instruction into RAM
	public boolean depositInstruction(int instruction) {
		return this.KACRam.depositInstruction(instruction);
	}

	// This method just loads a program into RAM from ROM
	public boolean loadROM() {
		this.KACRam.loadOneIntoRAM();

		return true;
	}

}
