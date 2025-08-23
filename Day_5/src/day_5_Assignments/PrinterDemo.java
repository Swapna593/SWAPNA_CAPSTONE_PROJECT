package day_5_Assignments;

public class PrinterDemo {
    public static void main(String[] args) {
        Printer p;

        p = new LaserPrinter();
        p.print("Document printed by LaserPrinter.");

        p = new InkjetPrinter();
        p.print("Document printed by InkjetPrinter.");
    }

    interface Printer {
        void print(String document);
    }

    static class LaserPrinter implements Printer {
        @Override
        public void print(String document) {
            System.out.println("LaserPrinter is printing...");
            System.out.println(document);
        }
    }

    static class InkjetPrinter implements Printer {
        @Override
        public void print(String document) {
            System.out.println("InkjetPrinter is spraying ink...");
            System.out.println(document);
        }
    }
}
