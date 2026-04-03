//linked list example
//basic example
import java.util.*;
public class LinkedListEg{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");

        System.out.println("Linked List: " + list);
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        
        //methods in linked list
        list.addFirst("Hi");
        list.addLast("Programming");

        System.out.println("Updated Linked List: " + list);

        System.err.println("First element: " + list.getFirst());
        System.err.println("Last element: " + list.getLast());

        list.removeFirst();
        list.removeLast();

        System.out.println("Updated Linked List: " + list);

        list.clear();
        System.out.println("Cleared Linked List: " + list);
        System.out.println("Is list empty? " + list.isEmpty());

        //linkedlist as list
        List<String> list2 = new LinkedList<>();
        list2.add("Hello");
        list2.add("World");
        list2.add("Java");

        System.out.println("Linked List as List: " + list2);

        //linkedlist as queue
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Linked List as Queue: " + queue);

        //linkedlit as deque
        LinkedList<Integer> dq = new LinkedList<>();
        dq.add(1);
        dq.add(2);
        dq.add(3);

        System.out.println("Linked List as Deque: " + dq);


        //iterating linked list
        System.out.println("Iterating Linked List:");
        LinkedList<String > list3 = new LinkedList<>();
        list3.add("A");
        list3.add("B");
        list3.add("C");
        Iterator<String> it = list3.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        //reverse iterating linked list
        System.out.println("Reverse Iterating Linked List:");
        LinkedList<String > list4 = new LinkedList<>();
        list4.add("X");
        list4.add("Y"); 
        list4.add("Z");
        Iterator<String> it2 = list4.descendingIterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}