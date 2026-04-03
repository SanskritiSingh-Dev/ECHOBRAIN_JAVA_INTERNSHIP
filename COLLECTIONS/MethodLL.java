import java.util.*;

public class MethodLL {
    public static void main(String[] args) {
        LinkedList <Integer> ll = new LinkedList<>();

        //addFirst & addLast
        ll.addFirst(20);
        ll.addLast(30);
        ll.addFirst(10);

        System.out.println("after addFirst and addLast: " + ll);

        //getFirst & getLast
        System.out.println("first element: " + ll.getFirst());
        System.out.println("last element: " + ll.getLast());

        //removeFirst & removeLast
        ll.removeFirst();
        ll.removeLast();
        System.out.println("after removeFirst and removeLast: " + ll);

        //Queue methods(offer, poll, peek)
        ll.offer(40);
        ll.offer(50);
        System.out.println("after offer: " + ll);
        System.out.println("poll: " + ll.poll());
        System.out.println("after poll: " + ll);
        System.out.println("peek: " + ll.peek());
        System.out.println("after peek: " + ll);

        //dequeue
        ll.offerFirst(5);
        ll.offerLast(60);

        System.out.println("after dequeue: " + ll);

        //stack methods(push, pop, peek){
        ll.push(1);
        System.out.println("after push: " + ll);
    
        ll.pop();
        System.out.println("after pop: " + ll);

        //reverse traversal
        System.out.println("reverse traversal:");
        Iterator<Integer> it = ll.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next() + " ");
        }
    
    }
}   
