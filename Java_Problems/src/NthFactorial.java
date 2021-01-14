public class NthFactorial {

    // Factorial n-th number
    public static long recursiveFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }


    // Factorial n-th number
    public static long iterativeFactorial(int n) {
        // factorial of 0 is 1
        if(n == 0) {
            return 1;
        }
        long product = 1;
        for(int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
