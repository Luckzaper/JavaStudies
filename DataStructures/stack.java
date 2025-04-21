package DataStructures;

import java.util.Stack;

public class stack {

    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("Alice");
        names.push("Bob");
        names.push("Charlie");
        names.push("David");
        names.push("Eve");
        names.push("Frank");

        // Prints the element at the top of the stack without removing it
        System.out.println(names.peek());
        // Removes the element at the top of the stack
        names.pop();
        System.out.println(names);
        // Returns the number of elements in the Stack
        System.out.println(names.size());
        // Returns the 1-based position of the element in the Stack if found, otherwise returns -1
        System.out.println(names.search("Charlie"));
    }
}