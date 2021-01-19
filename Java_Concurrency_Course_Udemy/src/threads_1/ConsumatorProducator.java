package threads_1;

import java.util.ArrayList;
import java.util.Random;

class Producator extends Thread {

    private Random random = new Random();

    public Producator(String nume) {
        super(nume);    // constructor clasa Thread
    }

    // wait() este introdus pentru eficientizare
    @Override
    public void run() {
        while (true) {
            try {
                synchronized (ConsumatorProducator.list) {
                    if (ConsumatorProducator.list.size() < 100) {
                        int numarNou = random.nextInt();
                        Thread.sleep(200);
                        ConsumatorProducator.list.add(numarNou);
                        System.out.println("A fost produs: " + numarNou + " de către " + Thread.currentThread().getName());
                        ConsumatorProducator.list.notifyAll();
                    } else {
                        ConsumatorProducator.list.wait();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Consumator extends Thread {

    public Consumator(String nume) {
        super(nume);
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (ConsumatorProducator.list) {
                    if (!ConsumatorProducator.list.isEmpty()) {
                        Thread.sleep(200);
                        int numarConsum = ConsumatorProducator.list.get(0);
                        ConsumatorProducator.list.remove(0);
                        System.out.println("A fost consumat: " + numarConsum + " de către " + Thread.currentThread().getName());
                        ConsumatorProducator.list.notifyAll();
                    } else {
                        ConsumatorProducator.list.wait();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}


public class ConsumatorProducator {

    public static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Producator p1 = new Producator("producator1");
        Producator p2 = new Producator("producator2");
        Producator p3 = new Producator("producator3");
        Consumator c1 = new Consumator("consumator1");
        Consumator c2 = new Consumator("consumator2");
        Consumator c3 = new Consumator("consumator3");

        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();
        c3.start();
    }
}
