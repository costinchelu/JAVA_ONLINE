

public class PrimalityTest {

    public static boolean isItAPrimeNumber(long n) {
        if (n < 2) {
            return false;
        }
        for (long i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
