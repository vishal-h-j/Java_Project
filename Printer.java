public class Printer {
    public synchronized void printDocument(String document, int totalPages) {
        for (int i = 1; i <= totalPages; i++) {
            System.out.println(Thread.currentThread().getName() + " is printing " + document + " (Page " + i + ")");
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted.");
            }
        }
        System.out.println(Thread.currentThread().getName() + " completed printing " + document);
    }
}