public class PrintingSimulation {
    public static void main(String[] args) {
        Printer sharedPrinter = new Printer();

        Thread t1 = new Thread(new PrintTask(sharedPrinter, "Assignment.pdf", 3), "Alice");
        Thread t2 = new Thread(new PrintTask(sharedPrinter, "Invoice.docx", 4), "Bob");
        Thread t3 = new Thread(new PrintTask(sharedPrinter, "Poster.png", 2), "Charlie");

        t1.start();
        t2.start();
        t3.start();
    }
}

class PrintTask implements Runnable {
    private Printer printer;
    private String file;
    private int pages;

    public PrintTask(Printer printer, String file, int pages) {
        this.printer = printer;
        this.file = file;
        this.pages = pages;
    }

    @Override
    public void run() {
        printer.printDocument(file, pages);
    }
}