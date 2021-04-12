package problems;

public class ReverseArray {

    // Reverse the values in an array
    public static void reverseArray(double a[]) {
        for(int i = 0; i < a.length/2; i++) {
            double temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }
}
