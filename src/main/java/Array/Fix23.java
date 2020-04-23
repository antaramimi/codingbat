package Array;

import java.util.Arrays;

/**
 * Questions:
 * Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0
 * Return the changed array.
 * Examples:
 * fix23([1, 2, 3]) → [1, 2, 0]
 * fix23([2, 3, 5]) → [2, 0, 5]
 * fix23([1, 2, 1]) → [1, 2, 1]
 */

public class Fix23 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix23(new int[]{1, 2, 3}))) ;
    }


    public static int[] fix23(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            int e = i + 1;
            if (e > nums.length) {
                break;
            }
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        return nums;
    }
}
