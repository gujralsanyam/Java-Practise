package Collections;


public class LinkedListPractice {

    class Node {
        int data;
        LinkedListPractice.Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public LinkedListPractice() {
        this.head = null;
        this.size = 0;
    }

    // Add element at last
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
        printList();
    }


    // Remove last element
    public void removeLast() {
        if (head == null)
            return;
        if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        size--;
        printList();
    }

    // Remove first elements
    public void removeFirst() {
        if (head == null)
            return;
        head = head.next;
        size--;
        printList();
    }

    // Add element at first
    public void addFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
        printList();
    }

    // Get size of linked list
    public int getSize() {
        System.out.println("Size of LinkedList:" + size);
        return size;
    }

    // Rotate linked list by k operations

    public void rotate(int k)
    {
        if(head == null || k<=0)
            return;
        Node temp = head;
        int length=1;
        while(temp.next!=null)
        {
            temp = temp.next;
            length++;
        }
        k=k%length;
        if(k == 0)
            return;
        temp.next=head;
        temp=head;
        for(int i=0; i < length-k-1; i++)
        {
            temp = temp.next;
        }
        head=temp.next;
        temp.next=null;
        printList();
    }



    // Reverse Linked List

    public void reverse()
    {
        Node prev = null, curr=head, next = null;

        while(curr!=null)
        {
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        printList();
    }


    // Print linked list
    public void printList() {
        Node temp = head;
        System.out.println("LinkedList : ");
        while (temp != null) {
            System.out.println(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        LinkedListPractice list = new LinkedListPractice();

        //Adding elements at last
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        // Removing last elements
        list.removeLast();

        // Removing first element
        list.removeFirst();

        // Adding element at first
        list.addFirst(5);

        // Adding element at last
        list.addLast(50);
        // Finding size
        list.getSize();
        // Rotating by 2 positions
        list.rotate(2);
        // Reversing the list
        list.reverse();
    }
}



