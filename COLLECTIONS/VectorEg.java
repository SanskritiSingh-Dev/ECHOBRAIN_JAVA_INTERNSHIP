
import java.util.Vector;

public class VectorEg {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);

        System.out.println("Vector: " + v);
        //different methods in vector
        System.out.println("Size of vector: " + v.size());
        System.out.println("Capacity of vector: " + v.capacity());
        System.out.println("Element at index 1: " + v.get(1));
        v.remove(0);
        System.out.println("Updated Vector: " + v);

        v.clear();
        System.out.println("Cleared Vector: " + v);
        System.out.println("Is vector empty? " + v.isEmpty());
        //adding elements again to check contains method
        v.add(10);
        v.add(20);
        v.add(30);
        System.out.println("Updated Vector: " + v);
        //contains method
        System.out.println("Does vector contain 20? " + v.contains(20));
        System.out.println("Does vector contain 40? " + v.contains(40));
        //set ele at perticular index
        v.set(0, 15);
        System.out.println("Updated Vector: " + v);
        //check collection
        Vector<Integer> v2 = new Vector<>();
        v2.add(10);
        v2.add(20);
        System.out.println("Does vector contain all elements of v2? " + v.containsAll(v2));
        v2.add(30);
        System.out.println("Does vector contain all elements of v2? " + v.containsAll(v2));

        //trimeToSize method
        v.trimToSize();
        System.out.println("Trimmed Vector: " + v);
        System.out.println("Capacity of trimmed vector: " + v.capacity());
        
        

    }
}
