package seedu.addressbook.data.person;

public class Street {
	private String streetName;
	
	/**
	 * Creates a Street object with the name provided
	 * @param name
	 */
	public Street(String name) { 
		this.setStreetName(name);
	}

	/**
	 * 
	 * @return streetName for that street
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * Changes the street name for that street
	 * @param streetName
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
}
