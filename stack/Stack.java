/*
 * Stack.java
 * @author mebs
 * @version 1.0
 */

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Stack {

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        char symbol;
//        Character[] array = {'[', '(', '{', ']', ')', '}'};
//        System.out.println("[ > " + (int)array[0] + "\n ( > " + (int)array[1] + "\n { > " +
//                (int)array[2] + "\n ] > " + (int)array[3]
//                + "\n ) > " + (int)array[4] + "\n } > " + (int)array[5]);
        System.out.println("Enter symbol > ");
        symbol = scanner.next().charAt(0);
        balance(symbol, stack);
        while(symbol != 'q'){
            try {
                System.out.println("Enter symbol > ");
                symbol = scanner.next().charAt(0);
                balance(symbol, stack);
            } catch (EmptyStackException e){
                System.out.println("Empty stack");
            }

        }
        if(stack.isEmpty()) System.out.println("Balanced expression");
        else System.out.println(stack.peek() + " > Unbalanced expression");
    }

    private static void balance(char symbol, Stack<Character> stack){
        if(symbol == '{' || symbol == '[' || symbol == '('){
            stack.push(symbol);
//            System.out.println(symbol + " pushed in the stack");
//            System.out.println(" Checking pushed properly " + stack.peek());
        }
        if(symbol == '}' && stack.peek() == '{') {
//            System.out.println( symbol + " matches with " + stack.peek());
            stack.pop();
//            System.out.println(" Checking removed properly " + stack.peek());
        }
        else if(symbol == ']' && stack.peek() == '[') {
//            System.out.println( symbol + " matches with " + stack.peek());
            stack.pop();
//            System.out.println(" Checking removed properly " + stack.peek());
        }
        else if(symbol == ')' && stack.peek() == '(') {
//            System.out.println( symbol + " matches with " + stack.peek());
            stack.pop();
//            System.out.println(" Checking removed properly " + stack.peek());
        }
    }
}
