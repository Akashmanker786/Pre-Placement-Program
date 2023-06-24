public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0; // Initialize count of elements not equal to val

        for (int num : nums) {
            if (num != val) {
                nums[k] = num;
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3}; // Example array
        int val = 3; // Value to remove

        int result = removeElement(nums, val);

        System.out.println("Result: " + result); // Print the number of elements not equal to val
        System.out.println("Updated Array: ");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " "); // Print the updated array
        }
    }
}




