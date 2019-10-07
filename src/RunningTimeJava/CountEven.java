package RunningTimeJava;

public class CountEven {
    public int countEven(int element[]) {
        int count = 0;
        for (int i = 0; i < element.length; i++) {
            if (element[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}


















