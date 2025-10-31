public class PagibigOffice {
    public static void main(String[] args) {
        CentralizedQueue desk1 = CentralizedQueue.getInstance();
        CentralizedQueue desk2 = CentralizedQueue.getInstance();
        CentralizedQueue desk3 = CentralizedQueue.getInstance();

        System.out.println("Desk 1 gives number: " + desk1.getNextNumber());
        System.out.println("Desk 2 gives number: " + desk2.getNextNumber());
        System.out.println("Desk 3 gives number: " + desk3.getNextNumber());

        desk2.resetQueue(50);

        System.out.println("Desk 1 next number: " + desk1.getNextNumber());
        System.out.println("Desk 3 current number: " + desk3.getCurrentNumber());
    }
}
