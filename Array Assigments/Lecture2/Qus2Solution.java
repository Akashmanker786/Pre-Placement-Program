import java.util.HashSet;
import java.util.Set;

class Solution {
    
    public int distributeCandies(int[] candyType) {
        int maxCandies = candyType.length / 2;
        
        Set<Integer> uniqueCandies = new HashSet<>();
        
        // Count the number of unique candy types
        for (int candy : candyType) {
            uniqueCandies.add(candy);
        }
        
        // Return the minimum of unique candy types and maxCandies
        return Math.min(uniqueCandies.size(), maxCandies);
    }
}

public class Qus2Solution {
    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        Solution solution = new Solution();
        int maxCandies = solution.distributeCandies(candyType);
        System.out.println("Maximum number of different types of candies: " + maxCandies);
    }
}
