package DataStructureSinglyLikedList;

public class SinglyLinkedList {
    private Node first;

    public SinglyLinkedList() {


    }

    public boolean isEmpty() {
        return first == null;

    }

    // We would use this function to insert element in the beginning of the list
    public void insertFirst(int data) {
        var node = new Node();
        node.data = data;
        node.next = first;
        first = node;

    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;

    }

    public void insertLast(int data) {
        var current = first;
        while (current.next != null) {
            current = current.next;

        }
        var node = new Node();
        node.data = data;
        current.next = node;

    }

    public void displayList() {
        System.out.println("List from first to last ");
        var current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }


}




















