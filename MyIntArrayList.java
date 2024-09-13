/**
 * A simple integer ArrayList class which should perform faster than Java's own ArrayList
 */

/* DONE: Complete the "ToDo" and "FixMe" tasks in this file. Your changes should make
all the tests in TestMyArray.java pass with 'TRUE' output. Change each "TODO"
item to DONE, and add DONE to your list of Java tags so that it remains in your 'Tasks' Window.
(under Window->Preferences->...  */

public class MyIntArrayList implements MySimpleList {

    private int size;
    private int[] contents;

    public MyIntArrayList() {
        //DONE: Construct your arrayList with an underlying array of some default size
        contents = new int[100_000];
        size = 0;
    }

    public MyIntArrayList(int n) {
        //DONE: Construct your arrayList with an underlying array of some size n\
        contents = new int[n];
        size = 0;
    }

    public void add(int n) {
        //DONE: underlying array is full. Allocate additional space
        if (size == contents.length) {
            int[] temp = new int[contents.length * 2];
            System.arraycopy(contents, 0, temp, 0, contents.length);
            contents = temp;
        }
        //DONE: Complete this method by adding int n to your array
        contents[size++] = n;
    }

    public String toString() {
        //DONE: If your array contains 5,4,6 then return string "[5, 4, 6]" regardless of your underlying array size
        String result = "[";
        for (int i = 0; i < size; i++) {
            result += contents[i];
            if (i < size - 1) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }

    public int remove(int pos) {
        //DONE: Remove the int at the given position 'pos'
        //DONE: Shift the rest of the items over to maintain array.
        //DONE: Decrease size of your collection
        //DONE: Return the integer item removed
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Index: " + pos + ", Size: " + size);
        }
        int removedValue = contents[pos];
        for (int i = pos; i < size - 1; i++) {
            contents[i] = contents[i + 1];
        }
        size--;
        return removedValue;
    }

    //DONE: include any missing methods (.size() and .get(i)) from the interface
    public int size() {
        return size;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return contents[index];
    }
}
