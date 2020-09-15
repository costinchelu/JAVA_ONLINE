public class NthFactorial {

    // Factorial n-th number
    public static long factorialRecursive(int n) {
        if(n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }


    // Factorial n-th number
    public static long factorialIterative(int n) {
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
