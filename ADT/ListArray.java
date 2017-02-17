/**
 * Implemented IListInt interface
 * @author mebs
 * @version 1.0
 */

public class ListArray implements IListInt {
    private int limit = 4;
    int[] array = new int[limit];

    @Override
    public void addFirst(int newElem) {
        if(this.array[limit - 1] != 0) System.err.println("Error Array is full!");
        if(this.array[0] != 0) {
            System.arraycopy(this.array, 0, this.array, 1, limit - 2);
        }
        this.array[0] = newElem;
    }

    @Override
    public void addLast(int newElem) {
        if(this.array[limit - 1] != 0) System.err.println("Error Array is full!");
        int i = 0;
        while(this.array[i] != 0) {
            i++;
        }
        this.array[i] = newElem;
    }

    @Override
    public void removeFirst() {
        System.arraycopy(this.array, 1, this.array, 0, limit - 2);
    }

    @Override
    public void removeLast() {
        int i = limit - 1;
        while(this.array[i] == 0) {
            i--;
        }
        this.array[i] = 0;
    }

    @Override
    public void insertAt(int index, int newElem) {
        array[index] = newElem;
    }

    @Override
    public boolean isEmpty() {
        for (int anArray : array) {
            if (anArray != 0) return false;
        }
        return true;
    }

    @Override
    public boolean contains(int elem) {
        for (int element : array) {
            if(elem == element) return true;
        }
        return false;
    }

    @Override
    public int getSize() {
        int i = 0;
        while(this.array[i] != 0) {
            i++;
        }
        return i;
    }

    @Override
    public int getIndexOf(int elem) {
        for(int i= 0; i < array.length; i++){
            if(elem == array[i]) return i;
        }
        System.out.println("Element " + elem + " not found");
        return 6; //index not possible in this array
    }

    @Override
    public int getFirst() {
        return array[0];
    }

    @Override
    public int getLast() {
        int i = 0;
        while(this.array[i] != 0) {
            i++;
        }
        return this.array[i-1];
    }

    @Override
    public int getAt(int index) {
        return array[index];
    }

    @Override
    public String toString(){
        // TODO: refactor avoid hardcore data
        return array[0] + " - " + array[1] + " - "+ array[2] + " - "+ array[3];
    }

    @Override
    public void removeAll(int elem) {
        for(int i= 0; i < array.length; i++){
            if(elem == array[i]) this.array[i] = 0;
        }
    }

    @Override
    public void removeAt(int index) {
        array[index] = 0;
    }
}
