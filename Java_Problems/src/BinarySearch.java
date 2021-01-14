public class BinarySearch {
    // Returns index of x if it is present in arr[],
    // else return -1
    public int binarySearch(int[] arr, int x) {
        int l = 0;
        int length = arr.length - 1;
        while (l <= length) {
            int middleElement = l + (length - l) / 2;

            // Check if x is present at mid
            if (arr[middleElement] == x) {
                return middleElement;
            }

            // If x greater, ignore left half . If x is smaller, ignore right half
            if (arr[middleElement] < x) {
                l = middleElement + 1;
            } else {
                length = middleElement - 1;
            }
        }
        // if we reach here, then element was not present
        return -1;
    }

    // Driver method to test above
    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int[] arr = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = ob.binarySearch(arr, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at " + "index " + result);
        }
    }
}
