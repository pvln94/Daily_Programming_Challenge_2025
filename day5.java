import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class LeadersInArray {
    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> leaderList = new ArrayList<>();
        if (n == 0) {
            return leaderList;
        }
        int maxFromRight = arr[n - 1];
        leaderList.add(maxFromRight);
      
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                leaderList.add(arr[i]);
                maxFromRight = arr[i];
            }
        }
      
        Collections.reverse(leaderList);
        return leaderList;
    }

  
    public static void main(String[] args) {
        System.out.println("Running Test Cases...\n");

      
        int[] arr1 = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> leaders1 = leaders(arr1.length, arr1);
        System.out.println("Test Case 1:");
        System.out.println("Input: " + Arrays.toString(arr1));
        System.out.println("Leaders: " + leaders1); 

        int[] arr2 = {1, 2, 3, 4, 0};
        ArrayList<Integer> leaders2 = leaders(arr2.length, arr2);
        System.out.println("Test Case 2:");
        System.out.println("Input: " + Arrays.toString(arr2));
        System.out.println("Leaders: " + leaders2); 

        int[] arr3 = {7, 10, 4, 10, 6, 5, 2};
        ArrayList<Integer> leaders3 = leaders(arr3.length, arr3);
        System.out.println("Test Case 3:");
        System.out.println("Input: " + Arrays.toString(arr3));
        System.out.println("Leaders: " + leaders3); 


        int[] arr4 = {5};
        ArrayList<Integer> leaders4 = leaders(arr4.length, arr4);
        System.out.println("Test Case 4:");
        System.out.println("Input: " + Arrays.toString(arr4));
        System.out.println("Leaders: " + leaders4); 


        int[] arr5 = {100, 50, 20, 10};
        ArrayList<Integer> leaders5 = leaders(arr5.length, arr5);
        System.out.println("Test Case 5:");
        System.out.println("Input: " + Arrays.toString(arr5));
        System.out.println("Leaders: " + leaders5); 
    }

}
