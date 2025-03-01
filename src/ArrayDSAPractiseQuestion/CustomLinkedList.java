package ArrayDSAPractiseQuestion;

class Node
{
    String data;
    Node next;
    Node prev;

    public Node(String data) {
        this.data = data;
    }
}
public class CustomLinkedList {
    Node head;

    public Node add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }

    public void remove() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        if (current.next == null) {
            current = null;
        } else {
            current.next = current.next.next;
        }
    }


    public void print() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data + "");
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("G");
        System.out.println("LinkedList after adding elements:");
        list.print();

        // Removing an element
        list.remove();
        System.out.println("LinkedList after removing elements:");
        list.print();
    }
}


