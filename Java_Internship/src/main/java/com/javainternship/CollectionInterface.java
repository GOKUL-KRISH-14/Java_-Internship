import java.util.*;

public class CollectionInterface
 {
    public static void main(String[] args) 
{
        // Example of ArrayList
        System.out.println("ArrayList Example:");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("ArrayList: " + arrayList);

        // Accessing elements
        System.out.println("First element: " + arrayList.get(0));

        // Removing an element
        arrayList.remove("Banana");
        System.out.println("ArrayList after removal: " + arrayList);

        // Example of LinkedList
        System.out.println("\nLinkedList Example:");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Horse");
        System.out.println("LinkedList: " + linkedList);

        // Adding elements at specific positions
        linkedList.addFirst("Elephant");
        linkedList.addLast("Zebra");
        System.out.println("LinkedList after adding: " + linkedList);

        // Removing elements
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after removing: " + linkedList);

        // Example of Vector
        System.out.println("\nVector Example:");
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println("Vector: " + vector);

        // Capacity and Size
        System.out.println("Vector capacity: " + vector.capacity());
        System.out.println("Vector size: " + vector.size());

        // Adding more elements
        vector.add(40);
        vector.add(50);
        System.out.println("Vector after adding: " + vector);

        // Example of Stack
        System.out.println("\nStack Example:");
        Stack<String> stack = new Stack<>();
        stack.push("Red");
        stack.push("Blue");
        stack.push("Green");
        System.out.println("Stack: " + stack);

        // Peek and Pop operations
        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Removing top element (pop): " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
