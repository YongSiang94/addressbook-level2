package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street, some unit, some postal code";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses must be in: a/BLOCK, STREET, UNIT, POSTAL_CODE";
    public static final String ADDRESS_VALIDATION_REGEX = ".+,.+,.+,.+";
    public static final String COMMA_SEPARATOR = ",";
    
    private static final int BLOCK_INDEX = 0;
    private static final int STREET_INDEX = 1;
    private static final int UNIT_INDEX = 2;
    private static final int POSTAL_INDEX = 3;
    
    // public final String value;
    private boolean isPrivate;
    private String[] splitAddress;
    
    private Block block;
    private Unit unit;
    private Street street;
    private PostalCode postal;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;
        if (!isValidAddress(trimmedAddress)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        // this.value = trimmedAddress;
        splitAddress = trimmedAddress.split(COMMA_SEPARATOR);
    }
    
    /**
     * Creates multiple smaller class (Block, Street, Unit, PostalCode) for the Address class.
     */
    public void initiatesAddrSubClass() { 
    	this.block = new Block(splitAddress[BLOCK_INDEX]);
    	this.street = new Street(splitAddress[STREET_INDEX]);
    	this.unit = new Unit(splitAddress[UNIT_INDEX]);
    	this.postal = new PostalCode(splitAddress[POSTAL_INDEX]);
    }
    
    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return new String(block.getBlockNumber() + ", " + street.getStreetName() + ", " + unit.getUnitNumber() + ", " + postal.getPostalCode());
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && splitAddress.toString().equals(((Address) other).splitAddress.toString())); // state check
    }

    @Override
    public int hashCode() {
        return splitAddress.toString().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}