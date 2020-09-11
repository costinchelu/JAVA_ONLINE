public class NthFibonacci {

    public static long fib(long n) {
        if (n <= 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }


    public static void main(String[] args) {
        for (long i = -1; i <= 20; i++) {
            System.out.println(i + " = " + fib(i));
        }
    }
}
