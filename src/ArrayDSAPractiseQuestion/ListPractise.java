package ArrayDSAPractiseQuestion;

import java.util.ArrayList;
import java.util.List;

public class ListPractise {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Adding element to the list
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        // Printing the list
        System.out.println("List: " + list);

        // Adding at a specific index
        list.add(1, "Grapes");
        System.out.println("After adding at index 1:" + list);

        // Iterate over the list
        System.out.println("Iterating over the list:");
        for(String fruit : list){
            System.out.println(fruit);
        }
    }
}


// FOR :-> IS basically itearte all the elements
//for example :- go with odd and even.
// foreach :-> it iterates each element, we cannot change the iteration and reverseiteration.

