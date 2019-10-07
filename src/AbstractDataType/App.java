package AbstractDataType;

public class App {
    public static void main(String[] args) {
        var myCounter = new Counter("myCounter");
        myCounter.increment();
        System.out.printf("%d ", myCounter.getCurrentValue());

    }
}
