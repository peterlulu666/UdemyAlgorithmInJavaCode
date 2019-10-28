package DataStructureQueue;

public class Queue {
    // The index for element at the back
    private int rearIndex;
    // The index for element at the front
    private int frontIndex;
    // Size of array
    private int size;
    // Queue Array
    private int[] queueArray;
    // The number of array element
    private int numberOfElement;

    public Queue(int size) {
        this.size = size;
        this.queueArray = new int[this.size];
        // There is no element in the array to be considered as the last one
        this.rearIndex = -1;
        this.frontIndex = 0;
        // There is no element in array
        this.numberOfElement = 0;


    }

    // Insert element from the rear of the queue
    public void insert(int number) {
        // Circular queue
        // When the element is greater than the array size. We would overwrite the element in the index 0
        if (rearIndex == size - 1) {
            rearIndex = -1;
        }
        rearIndex++;
        queueArray[rearIndex] = number;
        if (!isFull()) {
            numberOfElement++;

        }

    }

    public int remove() {
        if (numberOfElement == 0) {
            System.out.println("The queue is empty ");
            return -1;

        }
        int temp = queueArray[frontIndex];
        if (frontIndex == size) {
            // We would set the front index to 0 in order to utilize the entire array
            frontIndex = 0;

        } else {
            frontIndex++;

        }
        numberOfElement--;
        return temp;

    }

    public int peekFront() {
        return queueArray[frontIndex];

    }

    public boolean isEmpty() {
        return numberOfElement == 0;

    }

    public boolean isFull() {
        return numberOfElement == size;

    }

    public void view() {
        System.out.print("[ ");
        int arrayIndex;
        for (int i = 0; i < numberOfElement; i++) {
            if (frontIndex + i == size) {
                arrayIndex = 0;

            } else {
                arrayIndex = frontIndex + i;

            }
            System.out.print(this.queueArray[arrayIndex] + " ");
        }
        System.out.println("]");

    }
}


