package me.sirrus86.nbtedit.nbt;

public abstract interface ICommand {

	/**
	 * The command to issue to the server.
	 */
	public String getCommand();
	
	/**
	 * The last line of output generated by the command block. Still stored even
	 * if the gamerule commandBlockOutput is false. Appears in the GUI of the block
	 * when right-clicked, and includes a timestamp of when the output was produced.
	 */
	public String getLastOutput();
	
	/**
	 * Represents the strength of the analog signal output by redstone comparators
	 * attached to this command block. Only updated when the command block is
	 * activated with a redstone signal.
	 */
	public int getSuccessCount();
	
	/**
	 * 1 or 0 (true/false) - Determines whether or not the LastOutput will be stored.
	 * Can be toggled in the GUI by clicking a button near the "Previous Output" textbox.
	 * Caption on the button indicates current state: "O" if true,"X" if false.
	 */
	public byte getTrackOutput();
	
}
