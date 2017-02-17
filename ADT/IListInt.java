/**
 * Class to represent a list of integers
 */

public interface IListInt {
    
    void addFirst(int newElem);
	void addLast(int newElem);
	void removeFirst();
	void removeLast();
	void insertAt(int index, int newElem);
	boolean isEmpty();
	boolean contains(int elem);
	int getSize();
	int getIndexOf(int elem);
	int getFirst();
	int getLast();
	int getAt(int index);
	String toString();
	void removeAll(int elem);
	void removeAt(int index);
}
