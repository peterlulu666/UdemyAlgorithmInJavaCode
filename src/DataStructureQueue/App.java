package DataStructureQueue;

public class App {
    public static void main(String[] args) {
        var queue = new Queue(5);
        queue.insert(100);
        queue.insert(1000);
        queue.insert(14);
        queue.insert(12);
        queue.insert(44);
        queue.remove();
        queue.remove();
        queue.view();

    }
}
