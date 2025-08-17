import java.util.Arrays;

public class FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }


        int ptr1 = nums[0];
        int ptr2 = slow;

        while (ptr1 != ptr2) {
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }

        return ptr1;
    }

    public static void main(String[] args) {
        FindTheDuplicateNumber solver = new FindTheDuplicateNumber();
        
        int[] testCase1 = { 1, 3, 4, 2, 2 };
        System.out.println("\nTest Case 1: " + Arrays.toString(testCase1));
        System.out.println("Duplicate number: " + solver.findDuplicate(testCase1));

        int[] testCase2 = { 3, 1, 3, 4, 2 };
        System.out.println("Test Case 2: " + Arrays.toString(testCase2));
        System.out.println("Duplicate number: " + solver.findDuplicate(testCase2));

        int[] testCase3 = { 1, 1 };
        System.out.println("Test Case 3: " + Arrays.toString(testCase3));
        System.out.println("Duplicate number: " + solver.findDuplicate(testCase3));
        
        int[] testCase4 = { 1, 4, 4, 2, 3 };
        System.out.println("Test Case 4: " + Arrays.toString(testCase4));
        System.out.println("Duplicate number: " + solver.findDuplicate(testCase4));        
        
        int n = 99999;
        int[] testCase5 = new int[n + 1];
        for (int i = 0; i < n; i++) {
            testCase5[i] = i + 1;
        }
        testCase5[n] = 50000; 
        System.out.println("Duplicate number: " + duplicate);    
    }
}
