
import java.util.ArrayList;

public class ArrayListeg{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");

        System.out.println("ArrayList: " + list);

        //different data type example
        ArrayList<Object> list2 = new ArrayList<>();
        list2.add("Hi");
        list2.add(123);
        list2.add(true);

        System.out.println("ArrayList with different data types: " + list2);

        //different methods in arrayList
        System.out.println("Size of list: " + list.size());
        System.out.println("Element at index 1: " + list.get(1));
        list.remove(0);
        System.out.println("Updated ArrayList: " + list);
        list.clear();
        System.out.println("Cleared ArrayList: " + list);
        System.out.println("Is list empty? " + list.isEmpty()); 
        //adding elements again to check contains method
        list.add("Hello");
        //addAll
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Java");
        list3.add("Programming");
        list.addAll(list3);
        System.out.println("Updated ArrayList: " + list);

        //contains method
        System.out.println("Does list contain 'Java'? " + list.contains("Java"));
        System.out.println("Does list contain 'Python'? " + list.contains("Python"));

        //set ele at perticular index
        list.set(0, "Hi");
        System.out.println("Updated ArrayList: " + list);

        //check collection
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Hello");
        list4.add("World");
        System.out.println("Does list contain all elements of list4? " + list.containsAll(list4));
        list4.add("Java");
        System.out.println("Does list contain all elements of list4? " + list.containsAll(list4));


    }
}
//advantages
//1. Dynamic Size: ArrayList can grow and shrink dynamically as elements are added or removed, unlike arrays which have a fixed size.
//2. Easy to Use: ArrayList provides built-in methods for common operations like adding, removing, and accessing elements, making it easier to work with compared to arrays.
//3. Type Safety: With generics, ArrayList can be type-safe, ensuring that only objects of a specific type can be added, which helps prevent runtime errors.
//4. Performance: ArrayList provides constant-time performance for basic operations like adding and accessing elements, making it efficient for most use cases. However, it may have slower performance for certain operations like inserting or deleting elements in the middle of the list compared to linked lists.

//disadvantages
//1. Memory Overhead: ArrayList may consume more memory than arrays due to the need for additional data structures to manage the dynamic resizing and other features.
//2. Performance: While ArrayList provides constant-time performance for basic operations, it may have slower performance for certain operations like inserting or deleting elements in the middle of the list compared to linked lists, as it may require shifting elements to maintain the order.
//3. Not Synchronized: ArrayList is not synchronized, which means it is not thread-safe. If multiple threads access an ArrayList concurrently and at least one of the threads modifies the list structurally, it must be synchronized externally to prevent data corruption.    
