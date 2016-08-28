package seedu.addressbook.data.person;
import seedu.addressbook.data.exception.IllegalValueException;

public class PostalCode {
    public static final String EXAMPLE = "118153";
    public static final String MESSAGE_POSTALCODE_CONSTRAINTS = 
            "Person postal code should consist only of numbers";
    public static final String POSTALCODE_VALIDATION_REGEX = "\\d+";
    
    private String postalCode;
    
    /**
     * Validates given postal code.
     *
     * @throws IllegalValueException if given postal code string is invalid.
     */
    public PostalCode(String postalCode) throws IllegalValueException {
       
        if (!isPostalCodeValid(postalCode)) {
            throw new IllegalValueException(MESSAGE_POSTALCODE_CONSTRAINTS);
        }
        this.postalCode = postalCode;
    }
    
    public String getPostalCode(){
        return this.postalCode;
    }
    
    /*
     * Returns true is the postal code entered is of a valid format
     */
    public static boolean isPostalCodeValid(String test) {
        return test.matches(POSTALCODE_VALIDATION_REGEX);
    }
}
