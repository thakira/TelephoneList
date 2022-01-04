package phonelist;

/**
 * Tester class for TelephoneList.
 * <strong>GP2-EA2a</strong>
 * 
 * @author Verena Kauth
 * @version 1.0 - 15 Oct 2018
 *
 */
public class TelephoneTester {

    /**
     * Constructor.
     */
    public TelephoneTester() {
        menu();

    }

    /**
     * main method.
     * 
     * @param args
     *            - not used
     */
    public static void main(String[] args) {
        new TelephoneTester();
    }

    /**
     * shows menu for user to choose appropriate doing and evaluates which method
     * has to be called.
     */
    void menu() {
        String chosen = "";
        while (chosen.equalsIgnoreCase("e")) {
            System.out.println("\n\n  ********* Phonebook *********");
            System.out.println("\n  Please choose:\n  a = add new entry\n  s = search by name");
            System.out.println("  i = identify a number\n  d = delete entry");
            System.out.println("  e = exit\n");
            chosen = TelephoneList.getInput();
            switch (chosen) {
            case "a":
                TelephoneList.addEntry();
                break;
            case "s":
                TelephoneList.searchEntry();
                break;
            case "i":
                TelephoneList.identifyNumber();
                break;
            case "d":
                TelephoneList.deleteEntry();
                break;
            case "e":
                System.exit(0);
                break;
            default:
                System.out.println("unknown input");
                break;
            }
        }

    }
}
