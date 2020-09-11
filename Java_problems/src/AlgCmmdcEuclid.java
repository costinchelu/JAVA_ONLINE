public class AlgCmmdcEuclid {

    public static void main(String[] args) {

        int a = 50;
        int b = 125;

       long rezultat = cmmdc(a, b);
         if (rezultat == 1) {
             System.out.println("\nNumere prime intre ele");
         } else {
             System.out.println("\nCel mai mare divizor comun dintre " + a + " si " + b + " este " + rezultat);
         }
    }

    public static long cmmdc(long a, long b) {
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
