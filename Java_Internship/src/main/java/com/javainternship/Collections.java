import java.util.*;

public class Collection
{
    public static void main(String[] args) 
{
        
        List<String> list = new ArrayList<String>();
        list.add("GOKULA KRISHNAN");
        list.add("CHANDRU");
        list.add("VIGNESH");
        list.add("HARI KRISHNAN"); // Duplicate allowed in List
        System.out.println("List: " + list);

        // Sorting the list
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // Example of a Set
        Set<String> set = new HashSet<String>(list); // Duplicates will be removed
        set.add("JERRY");
        set.add("GOKULA KRISHNAN"); // Duplicate won't be added
        System.out.println("Set: " + set);

        // Example of a Queue
        Queue<String> queue = new LinkedList<String>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println("Queue: " + queue);

        // Polling from the queue (FIFO order)
        System.out.println("Polling from Queue: " + queue.poll());
        System.out.println("Queue after polling: " + queue);

        // Example of a Map
        Map<Integer, String> map = new HashMap<Integer,String>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println("Map: " + map);

        // Accessing elements from the map
        System.out.println("Value for key 2: " + map.get(2));

        // Iterating through the map
        System.out.println("Map Entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Utility methods
        System.out.println("Max in List: " + Collections.max(list));
        System.out.println("Frequency of 'GOKULAKRISHNAN' in List: " + Collections.frequency(list, "Banana"));
    }
}
