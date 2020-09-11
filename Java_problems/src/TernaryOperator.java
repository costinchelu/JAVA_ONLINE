public class TernaryOperator {

    public static void main(String[] args) {

        int a = 7;
        int b = 4;
        int c = 6;

        int max = (a > b) ? a : b;
        int min = (a < b) ? (a < c) ? a : c : (b < c) ? b : c;

        System.out.println("max = " + max);
        System.out.println("min = " + min);


        System.out.format("\nnumar %s", (a % 2 != 0) ? "impar" : "par");

    }
}
