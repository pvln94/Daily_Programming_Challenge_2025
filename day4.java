import java.util.Arrays;

public class InPlaceMerge {
    private static void swap(int[] arr1, int idx1, int[] arr2, int idx2) {
        int temp = arr1[idx1];
        arr1[idx1] = arr2[idx2];
        arr2[idx2] = temp;
    }


    public static void merge(int[] arr1, int[] arr2, int m, int n) {
        if (m == 0 || n == 0) {
            return; 
        }
        
        int totalLength = m + n;

        int gap = (totalLength / 2) + (totalLength % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < totalLength) {

                if (left < m && right < m) {
                    if (arr1[left] > arr1[right]) {
                        swap(arr1, left, arr1, right);
                    }
                }
      
                else if (left < m && right >= m) {
                    if (arr1[left] > arr2[right - m]) {
                        swap(arr1, left, arr2, right - m);
                    }
                }
                else { // left >= m and right >= m
                    if (arr2[left - m] > arr2[right - m]) {
                        swap(arr2, left - m, arr2, right - m);
                    }
                }
                
                

                left++;
                right++;
            }

            if (gap == 1) {
                break;
            }

            
            gap = (gap / 2) + (gap % 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Running Test Cases...\n");

        int[] arr1_1 = {1, 3, 5};
        int[] arr2_1 = {2, 4, 6};
        merge(arr1_1, arr2_1, arr1_1.length, arr2_1.length);
        System.out.println("Test Case 1:");
        System.out.println("arr1: " + Arrays.toString(arr1_1) );
        System.out.println("arr2: " + Arrays.toString(arr2_1) );

        int[] arr1_2 = {10, 12, 14};
        int[] arr2_2 = {1, 3, 5};
        merge(arr1_2, arr2_2, arr1_2.length, arr2_2.length);
        System.out.println("Test Case 2:");
        System.out.println("arr1: " + Arrays.toString(arr1_2) );
        System.out.println("arr2: " + Arrays.toString(arr2_2) );

        int[] arr1_3 = {2, 3, 8};
        int[] arr2_3 = {4, 6, 10};
        merge(arr1_3, arr2_3, arr1_3.length, arr2_3.length);
        System.out.println("Test Case 3:");
        System.out.println("arr1: " + Arrays.toString(arr1_3) );
        System.out.println("arr2: " + Arrays.toString(arr2_3) );

        int[] arr1_4 = {1};
        int[] arr2_4 = {2};
        merge(arr1_4, arr2_4, arr1_4.length, arr2_4.length);
        System.out.println("Test Case 4 (Edge Case):");
        System.out.println("arr1: " + Arrays.toString(arr1_4) );
        System.out.println("arr2: " + Arrays.toString(arr2_4) );

        int m = 100000;
        int n = 50000;
        int[] arr1_5 = new int[m];
        int[] arr2_5 = new int[n];
        for (int i = 0; i < m; i++) {
            arr1_5[i] = i + 1;
        }
        for (int i = 0; i < n; i++) {
            arr2_5[i] = 50001 + i;
        }
        merge(arr1_5, arr2_5, m, n);
        System.out.println("Test Case 5:");
        System.out.println("arr1: First few = ["+arr1_5[0]+", "+arr1_5[1]+"], Last few = ["+arr1_5[m-2]+", "+arr1_5[m-1]+"]");
        System.out.println("arr2: First few = ["+arr2_5[0]+", "+arr2_5[1]+"], Last few = ["+arr2_5[n-2]+", "+arr2_5[n-1]+"] \n");
    }
}
