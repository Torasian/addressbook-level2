package seedu.addressbook.data.person;
import seedu.addressbook.data.exception.IllegalValueException;

public class Street {
    public static final String EXAMPLE = "Clementi Ave 3";
    public static final String MESSAGE_STREET_CONSTRAINTS = 
            "Person postal code should consist of a series of numbers and letters";
    public static final String STREET_VALIDATION_REGEX = "[\\p{Alnum}]+";
    
    private String street;
    
    /**
     * Validates given street.
     *
     * @throws IllegalValueException if given street string is invalid.
     */
    public Street(String street) throws IllegalValueException {
       
        if (!isStreetValid(street)) {
            throw new IllegalValueException(MESSAGE_STREET_CONSTRAINTS);
        }
        this.street = street;
    }
    
    public String getStreet(){
        return this.street;
    }
    
    /*
     * Returns true is the street entered is of a valid format
     */
    public static boolean isStreetValid(String test) {
        return test.matches(STREET_VALIDATION_REGEX);
    }
}
