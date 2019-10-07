package DataStructureStack;

public class App {
    public static void main(String[] args) {
        var stack = new Stack(10);
        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);

        while (!stack.isEmpty()) {
            long value = stack.pop();
            System.out.printf("%d \n", value);
        }

    }
}
