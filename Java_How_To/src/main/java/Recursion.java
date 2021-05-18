
public class Recursion {
    public static void main(String[] args) {
        System.out.println("=OPERATION ORDER EXAMPLE=");

        recurseMethod(4);

        System.out.println("=FACTORIAL EXAMPLE=");

        System.out.println("Factorial of 8 is: " + factorial(8));

        System.out.println("=FIBONACCI EXAMPLE=");

        System.out.println("8th fibonacci number is: " + fibonacci(8));

    }

    private static void recurseMethod(int num) {
        if (num == 0) {
            return;
        } else {
            System.out.println("hello " + num);
            recurseMethod(--num);
            System.out.println("remainder " + num);
            return;
        }
    }

    // linear recursion
    private static double factorial(double d) {
        if (d <= 1) {
            return 1;
        } else {
            return factorial(d - 1) * d;
        }
    }

    // non linear recursion
    private static double fibonacci(double d) {
        if (d < 2) {
            return d;
        } else {
            return fibonacci(d - 1) + fibonacci(d - 2);
        }
    }
}