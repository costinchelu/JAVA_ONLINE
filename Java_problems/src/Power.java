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

    public static void main(String[] args) {
        double nr = 5.5;
        int putere = 6;

        System.out.println("Rezultatul este: " + ridicareLaPutere(nr, putere));
        System.out.format(Locale.ENGLISH, "Rezultat rotunjit: %.2f%n", ridicareLaPutere(nr, putere));
    }
}
