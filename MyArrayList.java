import java.util.Arrays;

/**
 * class which simulates the behaviour of an ArrayList with an Array.
 * <strong>GP2-EA2b</strong>
 * 
 * @author Verena Kauth
 * @version 1.0 - 19 Oct 2018
 *
 * @param <E> - Generic type for list
 *           
 */
public class MyArrayList<E> implements MyArrayListInterface<E> {
    /**
     * Array, which is used for simulating the ArrayList.
     */
    private E[] list;
    /**
     * size of the list.
     */
    private int size;
    /**
     * capacity of the list.
     */
    private int capacity;
    /**
     * when the list exceeds its boundary, it will be extended with this.
     */
    private int increment;

    /**
     * Constructor for own ArrayList.
     * 
     * @param c
     *            - starting capacity of the list
     * @param inc
     *            - increment with which the list will be extended if capacity
     *            exceeds
     */
    @SuppressWarnings("unchecked")
    public MyArrayList(int c, int inc) {
        if (c > 0) {
            this.capacity = c;
        } else {
            this.capacity = 10;
        }
        list = (E[]) new Object[c];
        size = 0;
        if (inc > 0) {
            this.increment = inc;

        } else {
            this.increment = 1;
        }

    }

    /**
     * Get the current capacity of the ArrayList.
     * 
     * @return the current capacity
     */
    @Override
    public int getCapacity() {
        return list.length;
    }

    /**
     * Gets the number of elements actually in the list.
     * 
     * @return number of elements.
     */
    @Override
    public int getSize() {
        int anzahl = 0;
        for (E entry : list) {
            if (entry != null) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Add one element at the last index.
     * 
     * @param e
     *            element to add.
     */
    @Override
    public void add(E e) {
        int index = getSize();
        if (getCapacity() <= getSize()) {
            increaseSize();
        }
        list[index] = e;
    }

    /**
     * Removes an element at the index.
     * 
     * @param index
     *            position that should be deleted.
     * @throws IndexOutOfBoundsException
     *             Index is not in the bounds.
     */
    @Override
    public void remove(int index) throws IndexOutOfBoundsException {
        size = getSize();
        for (int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        list[size - 1] = null;
        size = getSize();
        list = Arrays.copyOf(list, size);
        size--;
    }

    /**
     * Get the element at the index.
     * 
     * @param index
     *            position
     * @return Element at the index.
     * @throws IndexOutOfBoundsException
     *             Index is not in the bounds.
     */
    @Override
    public E get(int index) throws IndexOutOfBoundsException {
        try {
            return list[index];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("element not in list");
            return null;
        }

    }

    /**
     * Get the size of the internal Array.
     * 
     * @return size of internal array.
     */
    @Override
    public int getInternalLength() {
//        return list.length;
        int anzahl = 0;
        for (E entry : list) {
            if (entry != null) {
                anzahl++;
            }
        }
        return anzahl;
    }

    /**
     * Clears the ArrayList. Removes all elements and set the capacity back to its
     * initial value.
     */
    @SuppressWarnings("unchecked")
    @Override
    public void clear() {
        list = (E[]) new Object[capacity];
    }

    /**
     * increases the size of the list with the given increment if the actual
     * capacity is reached.
     */
    private void increaseSize() {
        list = Arrays.copyOf(list, list.length + increment);
    }

    /**
     * nicer Output of the list than simply comma-separated.
     */
    public void output() {
        System.out.println("************ Elements of the List *************");
        for (E entry : list) {
            if (entry != null) {
                System.out.println(entry);
            }
        }
        System.out.println("\nActual capacity of the list: " + getCapacity());
        System.out.println("The list contains " + getSize() + " elements.");
        System.out.println("***********************************************");
    }

    /**
     * Display the ArrayList as a string. The format is: a,b,c,d,e,...
     * 
     * @return String - comma separated output of the list
     */
    @Override
    public String toString() {
        String output = "";
        for (E entry : list) {
            if (entry != null) {
                output = output + entry + ", ";
            }
        }
        return output;

    }
}
