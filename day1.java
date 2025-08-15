import java.util.Arrays;

public class Sort012 {
    public static void sortArray(int[] arr) {
      
        if (arr == null || arr.length < 2) {
            return;
        }

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int temp;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Test Case 1
        int[] arr1 = { 0, 1, 2, 1, 0, 2, 1, 0 };
        System.out.println("\nTest Case 1:");
        System.out.println("Input:  " + Arrays.toString(arr1));
        sortArray(arr1);
        System.out.println("Output: " + Arrays.toString(arr1));

        // Test Case 2
        int[] arr2 = { 2, 2, 2, 2 };
        System.out.println("\nTest Case 2:");
        System.out.println("Input:  " + Arrays.toString(arr2));
        sortArray(arr2);
        System.out.println("Output: " + Arrays.toString(arr2));

        // Test Case 3
        int[] arr3 = { 0, 0, 0, 0 };
        System.out.println("\nTest Case 3:");
        System.out.println("Input:  " + Arrays.toString(arr3));
        sortArray(arr3);
        System.out.println("Output: " + Arrays.toString(arr3));

        // Test Case 4
        int[] arr4 = { 1, 1, 1, 1 };
        System.out.println("\nTest Case 4:");
        System.out.println("Input:  " + Arrays.toString(arr4));
        sortArray(arr4);
        System.out.println("Output: " + Arrays.toString(arr4));

        // Test Case 5
        int[] arr5 = { 2, 0, 1 };
        System.out.println("\nTest Case 5:");
        System.out.println("Input:  " + Arrays.toString(arr5));
        sortArray(arr5);
        System.out.println("Output: " + Arrays.toString(arr5));

        // Test Case 6 (Edge Case: Empty array)
        int[] arr6 = {};
        System.out.println("\nTest Case 6:");
        System.out.println("Input:  " + Arrays.toString(arr6));
        sortArray(arr6);
        System.out.println("Output: " + Arrays.toString(arr6));
    }
}
