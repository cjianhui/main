package seedu.address.model.person;

/**
 * Stores a person's current "Favourite" status
 *
 */
public class Favourite {
    public final Boolean value;

    public Favourite(Boolean val) {
        value = val;
    }

    public boolean getStatus() {
        return value;
    }

}
