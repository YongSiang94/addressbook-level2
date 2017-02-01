package seedu.addressbook.data.person;

public class Unit {
	private String unitNumber;
	
	/**
	 * Creates a new Unit object with the unitNumber given
	 * @param number
	 */
	public Unit(String number) { 
		this.setUnitNumber(number);
	}

	/**
	 * 
	 * @return the unitNumber of that unit.
	 */
	public String getUnitNumber() {
		return unitNumber;
	}

	/**
	 * Sets the new unitNumber for that unit.
	 * @param number
	 */
	public void setUnitNumber(String number) {
		this.unitNumber = number;
	}
}
