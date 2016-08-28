package seedu.addressbook.data.person;
import seedu.addressbook.data.exception.IllegalValueException;

public class Block {
    public static final String EXAMPLE = "123c";
    public static final String MESSAGE_BLOCK_CONSTRAINTS = 
            "Person block should consist of a series of numbers, sometimes follwed by a letter";
    public static final String BLOCK_VALIDATION_REGEX = "[\\d]*[\\w]";
    
    private String block;
    
    /**
     * Validates given block.
     *
     * @throws IllegalValueException if given block string is invalid.
     */
    public Block(String block) throws IllegalValueException {
       
        if (!isBlockValid(block)) {
            throw new IllegalValueException(MESSAGE_BLOCK_CONSTRAINTS);
        }
        this.block = block;
    }
    
    public String getBlock(){
        return this.block;
    }
    
    /*
     * Returns true is the block entered is of a valid format
     */
    public static boolean isBlockValid(String test) {
        return test.matches(BLOCK_VALIDATION_REGEX);
    }
}
