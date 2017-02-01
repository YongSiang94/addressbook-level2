package seedu.addressbook.data.person;

public class PostalCode {
	private String postalCode;
	
	/**
	 * Creates a PostalCode object with the postal given
	 * @param postal
	 */
	public PostalCode(String postal) { 
		this.setPostalCode(postal);
	}

	/**
	 * 
	 * @return postalCode of the PostalCode object
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * Changes the postal code of that PostalCode object
	 * @param postalCode
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
}
