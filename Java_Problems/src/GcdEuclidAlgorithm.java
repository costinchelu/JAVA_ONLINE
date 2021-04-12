package problems;

public class GcdEuclidAlgorithm {

    public static void main(String[] args) {

        int a = 50;
        int b = 125;

       long rezultat = gcm(a, b);
         if (rezultat == 1) {
             System.out.println("\nPrime nubers between each other");
         } else {
             System.out.println("\nGreatest common divisor between " + a + " & " + b + " is " + rezultat);
         }
    }

    public static long gcm(long a, long b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
}
