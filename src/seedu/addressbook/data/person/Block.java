package seedu.addressbook.data.person;

public class Block {
	
	private String blockNumber;

	/**
	 * Creates a Block object with the number given
	 * @param number
	 */
	public Block(String number) {
		this.setBlockNumber(number);
	}

	/**
	 * 
	 * @return blockNumber of the block
	 */
	public String getBlockNumber() {
		return blockNumber;
	}

	/**
	 * sets the block number for the block
	 * @param number
	 * 
	 */
	public void setBlockNumber(String number) {
		this.blockNumber = number;
	}
}
