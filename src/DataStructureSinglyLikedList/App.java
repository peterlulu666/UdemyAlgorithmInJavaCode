package DataStructureSinglyLikedList;

public class App {
    public static void main(String[] args) {
        var singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(100);
        singlyLinkedList.insertFirst(50);
        singlyLinkedList.insertFirst(99);
        singlyLinkedList.insertFirst(88);
        singlyLinkedList.insertLast(1000);
        singlyLinkedList.deleteFirst();
        singlyLinkedList.deleteFirst();
        singlyLinkedList.displayList();
    }
}
