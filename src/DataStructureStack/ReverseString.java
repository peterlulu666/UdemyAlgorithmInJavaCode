package DataStructureStack;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));
    }

    public static String reverseString(String str) {
        // the maximum stack size
        int stackSize = str.length();
        // we make the stack
        var theStack = new Stack(stackSize);
        for (int i = 0; i < str.length(); i++) {
            // iterate character from the input String
            char c = str.charAt(i);
            theStack.push(c);

        }

        String result = "";
        while (!theStack.isEmpty()) {
            char c = (char) theStack.pop();
            // appending to the output
            result = result + c;
        }

        return result;
    }

}
