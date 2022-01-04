package phonelist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * class which implements an ArrayList for storing phone numbers and the
 * possibility to search, identify and delete contacts from it.
 * <strong>GP2-EA2a</strong>
 * 
 * @author Verena Kauth
 * @version 1.0 - 15 Oct 2018
 * 
 *
 */
public class TelephoneList implements TelephoneListSpec {
    /**
     * creates ArrayList-Object for storing contact data.
     */
    static ArrayList<TelephoneEntry> telephoneList = new ArrayList<TelephoneEntry>();

    /**
     * method for adding a new contact to the TelephoneList.
     */
    public static void addEntry() {
        String name = "";
        String number = "";
        System.out.print("Please enter name: ");
        name = getInput();
        System.out.print("Please enter phonenumber of " + name + ": ");
        number = getInput();
        TelephoneEntry newEntry = new TelephoneEntry(name, number);
        telephoneList.add(newEntry);
        System.out.println(newEntry.getName() + ", " + newEntry.getPhoneNumber() 
            + " is now in phonebook.");
        System.out.println("Your phonebook now has " + telephoneList.size() + " entries.");
    }

    /**
     * Method for searching an entry within the list by name.
     */
    public static void searchEntry() {
        String name = "";
        System.out.print("Please enter name of you are searching for: ");
        name = getInput();
        if (telephoneList.isEmpty()) {
            System.out.println("The list is empty!");
        } else {
            for (TelephoneEntry entry : telephoneList) {
                if (entry.getName().equalsIgnoreCase(name)) {
                    System.out.println("The phonenumber of " + entry.getName() 
                        + " is: " + entry.getPhoneNumber());
                    return;
                } else {
                    System.out.println("Entry not found!");
                }
            }
        }
    }

    /**
     * Method for searching a contact within the list by number.
     */
    public static void identifyNumber() {
        String number = "";
        System.out.print("Please enter the number you want to identify: ");
        number = getInput();
        if (telephoneList.isEmpty()) {
            System.out.println("The list is empty!");
        } else {
            for (TelephoneEntry entry : telephoneList) {
                if (entry.getPhoneNumber().equalsIgnoreCase(number)) {
                    System.out.println("The number " + entry.getPhoneNumber() 
                        + " belongs to: " + entry.getName());
                    return;
                } else {
                    System.out.println("Entry not found!");
                }
            }
        }
    }

    /**
     * method for deleting an object from the ArrayList by contact name.
     */
    public static void deleteEntry() {
        String name = "";
        System.out.print("Please enter the name of the entry you want to remove: ");
        name = getInput();
        if (telephoneList.isEmpty()) {
            System.out.println("The list is empty!");
        } else {
            for (TelephoneEntry entry : telephoneList) {
                if (entry.getName().equalsIgnoreCase(name)) {
                    telephoneList.remove(entry);
                    System.out.println("The entry " + name + " has been deleted");
                    System.out.println("Your phonebook now has " 
                            + telephoneList.size() + " entries.");
                    return;
                } else {
                    System.out.println("Entry not found!");
                }
            }
        }
    }

    /**
     * Method for read in user input for all methods.
     * 
     * @return input - input the user wrote to console.
     */
    static String getInput() {
        String input = "";
        try {
            // create reader object to read input from "shell"
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            // read input
            input = br.readLine();

        } catch (IOException e) {
            System.err.println(e);
        }
        return input;
    }

}
