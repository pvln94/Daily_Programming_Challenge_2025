public class MissingNumberFinder {

    public static int findMissingNumberSum(int[] arr) {
        int n = arr.length + 1;
        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return (int) (expectedSum - actualSum);
    }

    public static int findMissingNumberXOR(int[] arr) {
        int n = arr.length + 1;
        int xorResult = 0;
        for (int i = 1; i <= n; i++) {
            xorResult ^= i;
        }
        for (int num : arr) {
            xorResult ^= num;
        }
        return xorResult;
    }

    public static void main(String[] args) {
        // Test Cases
        int[] testCase1 = { 1, 2, 4, 5 };
        System.out.println("Test Case 1: [1, 2, 4, 5]");
        System.out.println("Missing number (Sum Method): " + findMissingNumberSum(testCase1));
        System.out.println("Missing number (XOR Method): " + findMissingNumberXOR(testCase1));

        int[] testCase2 = { 2, 3, 4, 5 };
        System.out.println("Test Case 2: [2, 3, 4, 5]");
        System.out.println("Missing number (Sum Method): " + findMissingNumberSum(testCase2));
        System.out.println("Missing number (XOR Method): " + findMissingNumberXOR(testCase2));

        int[] testCase3 = { 1, 2, 3, 4 };
        System.out.println("Test Case 3: [1, 2, 3, 4]");
        System.out.println("Missing number (Sum Method): " + findMissingNumberSum(testCase3));
        System.out.println("Missing number (XOR Method): " + findMissingNumberXOR(testCase3));

        int[] edgeCase1 = { 1 };
        System.out.println("Edge Case 1: [1]");
        System.out.println("Missing number (Sum Method): " + findMissingNumberSum(edgeCase1));
        System.out.println("Missing number (XOR Method): " + findMissingNumberXOR(edgeCase1));

        int[] edgeCase2 = { 2 };
        System.out.println("Edge Case 2: [2]");
        System.out.println("Missing number (Sum Method): " + findMissingNumberSum(edgeCase2));
        System.out.println("Missing number (XOR Method): " + findMissingNumberXOR(edgeCase2));

    }
}
