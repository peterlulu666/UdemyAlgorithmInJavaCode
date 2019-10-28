package DataStructureLinkedlist;

public class App {
    public static void main(String[] args) {
        var nodeA = new Node();
        nodeA.data = 4;

        var nodeB = new Node();
        nodeB.data = 3;

        var nodeC = new Node();
        nodeC.data = 7;

        var nodeD = new Node();
        nodeD.data = 8;

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeB));


    }

    public static int listLength(Node node) {
        int length = 0;
        var currentNode = node;
        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;

        }
        return length;

    }
}
