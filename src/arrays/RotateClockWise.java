package arrays;

import java.util.Arrays;

public class RotateClockWise {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(nums));
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;
        System.out.println("After Logic");
        System.out.println(Arrays.toString(nums));
    }
}
