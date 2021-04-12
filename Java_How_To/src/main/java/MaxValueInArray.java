public class MaxValueInArray {

    // find maximum value in an array
    public static double maxNumberInArray(double[] arr) {

        double max = Double.NEGATIVE_INFINITY;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        System.out.println("\nMaximum number in the array is " + String.format("%.4f", max));
        return max;
    }

}
