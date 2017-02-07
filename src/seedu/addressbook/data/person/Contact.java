package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {
	protected boolean isPrivate;
	private final String value;
	
	
    /**
     * Validates given Contact
     *
     * @throws IllegalValueException if given Contact args is invalid.
     */
    public Contact(String value, boolean isPrivate, String constraints, String regex) throws IllegalValueException {
        String contactInfo = value.trim();
        this.isPrivate = isPrivate;
        if (!isValidContact(contactInfo, regex)) {
            throw new IllegalValueException(constraints);
        }
        this.value = contactInfo;
    }
    
    /**
     * Returns true if a given string is a valid Contact.
     */
    public static boolean isValidContact(String test, String regex) {
        return test.matches(regex);
    }
    
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
