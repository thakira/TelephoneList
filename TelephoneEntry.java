package phonelist;

/**
 * class for gathering name and phonenumber for phonelist-ArrayList.
 * <strong>GP2-EA2a</strong>
 * 
 * @author Verena Kauth
 * @version 1.0 - 15 Oct 2018
 *
 */
public class TelephoneEntry {
    /** 
     * name of the contact.
     */
    String name;
    /**
     * phone number of the contact.
     */
    String phoneNumber;
    
    /** 
     * constructor for TelephoneEntry-Object.
     * @param name - name of the contact
     * @param phoneNumber - phone number of the contact
     */
    public TelephoneEntry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
/**
 * getter for name.
 * @return name - name of the contact
 */
    public String getName() {
        return name;
    }
/**
 * setter for name.
 * @param name - name of the contact
 */
    public void setName(String name) {
        this.name = name;
    }
/**
 * Getter for phoneNumber.
 * @return phoneNumber of the contact
 */
    public String getPhoneNumber() {
        return phoneNumber;
    }
/**
 * Setter for phonenumber.
 * @param phoneNumber - phone number of the contact
 */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
