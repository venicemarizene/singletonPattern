public class CentralizedQueue {
    private static CentralizedQueue instance;  
    private int currentNumber;

    private CentralizedQueue() {
        currentNumber = 0;
    }

    public static synchronized CentralizedQueue getInstance() {
        if (instance == null) {
            instance = new CentralizedQueue();
        }
        return instance;
    }

    public synchronized int getNextNumber() {
        currentNumber++;
        return currentNumber;
    }

    public synchronized int getCurrentNumber() {
        return currentNumber;
    }

    public synchronized void resetQueue(int newNumber) {
        currentNumber = newNumber;
        System.out.println("Queue number reset to: " + currentNumber);
    }
}
