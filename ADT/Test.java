import java.util.Random;

/**
 * Main Class to test each method
 */

public class Test {

    public static void main(String[] args) {
        ListArray array = new ListArray();
        System.out.println(array.toString());
        Random ran = new Random();
        array.addFirst(6);
        System.out.println("Aggregated > " + array.array[0]);
        array.addFirst(8);
        System.out.println("Aggregated > " + array.array[0]);
        array.addLast(7);
        System.out.println(array.toString());
        System.out.println("Size > " + array.getSize());
        array.removeFirst();
        System.out.println("After remove first > " + array.toString());
        array.removeLast();
        System.out.println("After remove last > " + array.toString());
        array.insertAt(2, 5);
        System.out.println("After insertAt > " + array.toString());
        System.out.println("Not empty > " + array.isEmpty());
        System.out.println("Contains 5 > " + array.contains(5));
        System.out.println(" Get first > " + array.getFirst()); // 6
        System.out.println(" Get last > " + array.getLast()); // 5
        System.out.println(" Get at > " + array.getAt(1)); // 7
        System.out.println(" Get index of > " + array.getIndexOf(5)); // expected 2
        System.out.println(" Get index of > " + array.getIndexOf(4)); // expected not found
        array.removeAt(2);
        System.out.println("After removeAt 2 > " + array.toString());
        array.removeAll(6);
        System.out.println("After removeAll 6s > " + array.toString());
        array.addLast(ran.nextInt(10 - 1) + 1);
        System.out.println("X position element > " + array.array[3]); // expected 0

    }

}
