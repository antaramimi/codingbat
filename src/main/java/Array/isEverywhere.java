package Array;

/**
 * Questions:
 * We'll say that a value is "everywhere" in an array
 * if for every pair of adjacent elements in the array,
 * at least one of the pair is that value.
 * Return true if the given value is everywhere in the array.
 * Examples:
 * isEverywhere([1, 2, 1, 3], 1) → true
 * isEverywhere([1, 2, 1, 3], 2) → false
 * isEverywhere([1, 2, 1, 3, 4], 1) → false
 */

public class isEverywhere {
    public boolean isEverywhere(int[] nums, int val) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val&& nums[i+1]!=val)
                return false;

        }
        return true;
    }
}