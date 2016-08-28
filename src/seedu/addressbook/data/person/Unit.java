package seedu.addressbook.data.person;
import seedu.addressbook.data.exception.IllegalValueException;

public class Unit {
    public static final String EXAMPLE = "#12-34";
    public static final String MESSAGE_UNIT_CONSTRAINTS = 
            "Person unit should be given in the following format #number-number";
    public static final String UNIT_VALIDATION_REGEX = "#[\\d]+-[\\d]+";
    
    private String unit;
    
    /**
     * Validates given street.
     *
     * @throws IllegalValueException if given unit string is invalid.
     */
    public Unit(String unit) throws IllegalValueException {
       
        if (!isStreetValid(unit)) {
            throw new IllegalValueException(MESSAGE_UNIT_CONSTRAINTS);
        }
        this.unit = unit;
    }
    
    public String getUnit(){
        return this.unit;
    }
    
    /*
     * Returns true is the unit entered is of a valid format
     */
    public static boolean isStreetValid(String test) {
        return test.matches(UNIT_VALIDATION_REGEX);
    }
}
