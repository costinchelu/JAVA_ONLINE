import java.util.Locale;

public class Power {

    public static double ridicareLaPutere(double a, int b) {
        double result = 1d;
        while (b > 0) {
            result *= a;
            b--;
        }
        return result;
    }

    // Compute the largest power of 2 less than or equal to n:
    public static long largestPower(long n) {
        long power = 1;
        long result = 1;
        while(result <= n / 2) {
            result *= 2;
            System.out.println("2 ^ " + power + " = " + result);
            power++;
        }
        return power - 1;
    }

    public static void main(String[] args) {
        double nr = 5.5;
        int putere = 6;

        System.out.println("Rezultatul este: " + ridicareLaPutere(nr, putere));
        System.out.format(Locale.ENGLISH, "Rezultat rotunjit: %.2f%n", ridicareLaPutere(nr, putere));
    }
}
