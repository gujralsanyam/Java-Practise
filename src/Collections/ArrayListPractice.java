package Collections;
import java.util.ArrayList;


public class ArrayListPractice {

    private ArrayList<Integer> list;

    public ArrayListPractice() {
        list = new ArrayList<>();
    }

    // 1.) Removing element from the last.
    public void removeLast()
    {
        if(!list.isEmpty()) {
            list.remove(list.size()-1);
        }
        else{
            System.out.println("List is empty");
        }
    }


    // 2.) Removing elements from the beginning
    public void removeFirst() {
        if (!list.isEmpty()) {
            list.remove(0);
        } else {
            System.out.println("List is empty");
        }
    }


    // 3. Removing element from the beginning (same as #2, duplicated)
    public void removeFirstAgain() {
        removeFirst(); // Reuse the previous method
    }


    // 4. Adding element at the first
    public void addFirst(int element) {
        list.add(0, element);
    }

    // 5. Adding element at last
    public void addLast(int element) {
        list.add(element);
    }

    // 6. Finding the size of the list
    public int size() {
        return list.size();
    }


    // 7. Rotating elements (circular rotation by one position)
    public void rotateLeft()
    {
        if(!list.isEmpty()) {
            int firstElement = list.get(0);
            list.remove(0);
            list.add(firstElement);
        }
        else{
            System.out.println("List is empty");
        }
    }


   // 8. Rotating right

    public void rotateRight()
    {
        if(!list.isEmpty())
        {
            int lastElement = list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0, lastElement);
        } else{
            System.out.println("List is empty");
        }
    }


    // Circular Rotation
    public void rotate()
    {
        if(!list.isEmpty()){
            int firstElement = list.get(0);
            list.remove(0);
            list.add(firstElement);
        } else{
            System.out.println("List is empty");
        }
    }


    // 7. Reversing the elements
    public void reverse()
    {
        int left=0, right = list.size()-1;
        while(left<right) {
            // Swap elements
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            // Move pointers
            left++;
            right--;
        }
    }

    public void printList() {
        System.out.println(list);
    }


    public static void main(String[] args) {
        ArrayListPractice customList = new ArrayListPractice();

        // Add some elements to the list
        customList.addFirst(10);
        customList.addFirst(20);
        customList.addFirst(30);
        customList.addFirst(40);

        System.out.println("List after adding elements at first: ");
        customList.printList();

        //Remove Last element
        customList.removeLast();
        System.out.println("List after removing last element");
        customList.printList();

        //Remove first element
        customList.removeFirst();
        System.out.println("List after removing first element: ");
        customList.printList();

        // Remove again from the beginning
        customList.removeFirstAgain();
        System.out.println("List after removing first element again: ");
        customList.printList();

        // Find size of the list
        System.out.println("Size of the list: " + customList.size());

        // Rotate elements
        customList.rotate();
        System.out.println("List after rotating elements: ");
        customList.printList();

        // Reversing the element
        customList.reverse();
        System.out.println("List after reversing: ");
        customList.printList();

    }
}

