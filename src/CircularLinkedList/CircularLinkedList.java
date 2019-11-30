package CircularLinkedList;

public class CircularLinkedList {
    private Node first;
    private Node last;

    public CircularLinkedList() {
        first = null;
        last = null;

    }

    public void insertFirst(int data) {
        var node = new Node();
        node.data = data;
        if (isEmpty()){
            last = node;

        }
        node.next = first;
        first = node;

    }

    private boolean isEmpty() {
        return first == null;
        
    }
}
