/**
 * tester class for MyArrayList.
 * <strong>GP2-EA2b</strong>
 * 
 * @author Verena Kauth
 * @version 1.0 - 19 Oct 2018
 *
 */
public class MyArrayListTester {
/**
 * main method.
 * goes through all methods of MyArrayList
 * @param args - not used
 */
    
    public static void main(String[] args) {
        /**
         * creating new MyarrayList.
         */
        MyArrayList<Object> myList = new MyArrayList<Object>(3, 5);    
        
        System.out.println("List created with a starting capacity of " 
                + myList.getCapacity() + ".");
        System.out.println("At the moment there are " + myList.getSize() 
            + " elements in the list.");
        System.out.println("***********************************************");
        System.out.println("Adding some elements: ");
        myList.add("First element");
        System.out.println("Added Element at index[0]: " + myList.get(0));
        myList.add("Second element");
        System.out.println("Added Element at index[1]: " + myList.get(1));
        myList.add("Third element");
        System.out.println("Added Element at index[2]: " + myList.get(2));
        myList.add("Fourth element");
        System.out.println("Added Element at index[3]: " + myList.get(3));
        myList.add("another element");
        System.out.println("Added Element at index[4]: " + myList.get(4));
        myList.add(123.123);
        System.out.println("Added Element at index[5]: " + myList.get(5));
        myList.add(5730753);
        System.out.println("Added Element at index[6]: " + myList.get(6));
        System.out.println("The list now holds " + myList.getSize() 
            + " elements and has a maximum capacity of "
                + myList.getCapacity() + ".");
        System.out.println("The internalLength is: " + myList.getInternalLength());
        System.out.println("Content of the list right now: " + myList.toString());
        System.out.println("***********************************************");
        System.out.println("Deleting element at index 3:");
        myList.remove(3);
        System.out.println("Element at index 3 is now: " + myList.get(3).toString());
        System.out.println("Size of the list is now: " + myList.getSize());
        System.out.println("Capacity of the list was set to: " + myList.getCapacity());
        System.out.println("The internalLength is: " + myList.getInternalLength());
        myList.output();
        System.out.println("List will be cleared...");
        myList.clear();
        System.out.println("List cleared");
        System.out.println("Capacity: " + myList.getCapacity());
        System.out.println("Items in list: " + myList.getSize());
        System.out.println("The internalLength is: " + myList.getInternalLength());
    }
}
