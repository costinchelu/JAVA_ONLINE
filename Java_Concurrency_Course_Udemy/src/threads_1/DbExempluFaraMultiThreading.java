package threads_1;

public class DbExempluFaraMultiThreading {

    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();

        collectDataFromDB1();
        collectDataFromDB2();

        long l2 = System.currentTimeMillis();
        System.out.println(l2 - l1);
    }


    public static void collectDataFromDB1() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void collectDataFromDB2() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
