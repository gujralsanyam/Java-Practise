package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


//Java provides three main implementations of the Set interface:
//
//HashSet → Unordered, allows unique elements, fast operations (O(1) on average).
//LinkedHashSet → Maintains insertion order, slightly slower than HashSet (O(1) on average).
//TreeSet → Sorted order (ascending by default), based on Red-Black Tree (O(log n) operations).


public class CustomSet {

    private HashSet<Integer> hashSet;
    private LinkedHashSet<Integer> linkedHashSet;
    private TreeSet<Integer> treeSet;


    public CustomSet() {
        hashSet = new HashSet<>();
        linkedHashSet = new LinkedHashSet<>();
        treeSet = new TreeSet<>();
    }

    // Add elements to all sets
    public void add(int value) {
        hashSet.add(value);
        linkedHashSet.add(value);
        treeSet.add(value);
        printSets();
    }

    // Remove element from all sets
    public void remove(int value) {
        hashSet.remove(value);
        linkedHashSet.remove(value);
        treeSet.remove(value);
        printSets();
    }

    // check if an element exists in any set
    public boolean contains(int value) {
        return hashSet.contains(value);
    }

    // Get size of any set
    public int size() {
        return hashSet.size();
    }

    // Print all sets
    public void printSets() {
        System.out.println("HashSet:" + hashSet);
        System.out.println("LinkedHashSet" + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("----------------------");
    }

    // Main class to test the Custom Set
    public static void main(String[] args) {
        CustomSet customSet = new CustomSet();

        customSet.add(30);
        customSet.add(10);
        customSet.add(20);

        System.out.println("Contains 10? " + customSet.contains(10));

        customSet.remove(20);
        System.out.println("Set size:" + customSet.size());
    }
}






