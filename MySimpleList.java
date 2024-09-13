/**
 * This is an interface that defines the methods of a list data type
 */
public interface MySimpleList {

	/** Gets the int at position pos
	 * @param pos the position of the element to get
	 * @return the int at index pos
	 */
	public int get(int pos);

	/**
	 * Removes (and returns) the int at position pos
	 * @param pos the position of the element to remove
	 * @return the int removed from the list
	 */
	public int remove(int pos);

	/**
	 * Adds an int to the list
	 * @param value the int to add
	 */
	public void add(int value);

	/**
	 * Returns the number of elements in this list
	 * @return the number of elements in the list
	 */
	public int size();

	/**
	 * Returns a string representation of the list
	 * @return a string representation of the list
	 */
	public String toString();

}