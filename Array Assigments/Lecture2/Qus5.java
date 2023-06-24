import java.util.Arrays;
public class Qus5 {
    



    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        // Case 1: The three largest numbers have positive values
        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        // Case 2: The two smallest numbers and the largest number have negative values
        int product2 = nums[0] * nums[1] * nums[n - 1];

        // Return the maximum of the two products
        return Math.max(product1, product2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
     Qus5 maximumProduct = new Qus5();
        int maxProduct = maximumProduct.maximumProduct(nums);
        System.out.println("Maximum product: " + maxProduct);
    }
}

