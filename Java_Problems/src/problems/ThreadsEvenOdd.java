package problems;

class ThreadsEvenOdd implements Runnable {

    private int max;
    private Printer printer;
    private boolean isEvenNumber;

    public ThreadsEvenOdd(Printer printer, int max, boolean isEvenNumber) {
        this.max = max;
        this.printer = printer;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {
        int number = isEvenNumber ? 2 : 1;
        while (number <= max) {
            if (isEvenNumber) {
                printer.printEven(number);
            } else {
                printer.printOdd(number);
            }

            number += 2;
        }
    }
}


class Printer {

    private volatile boolean isOdd;   // boolean default value is false

    // this will run first (and then will not enter in while)
    public synchronized void printOdd(int number) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + " : " + number);
        isOdd = true;

        notify();
    }


    public synchronized void printEven(int number) {
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + " : " + number);
        isOdd = false;
        notify();
    }
}


class Demo {

    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread t1 = new Thread(new ThreadsEvenOdd(printer, 20, false), "Odd");
        Thread t2 = new Thread(new ThreadsEvenOdd(printer, 20, true), "Even");

        t1.start();
        t2.start();
    }
}