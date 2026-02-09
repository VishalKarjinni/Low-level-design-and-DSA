package arrays;

import java.util.Arrays;

public class LeftRotateByOnePlace {
    public int[] leftRotateByOnePlace(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        LeftRotateByOnePlace rotateByOnePlace = new LeftRotateByOnePlace();
        int[] ints = rotateByOnePlace.leftRotateByOnePlace(nums);
        System.out.println(Arrays.toString(ints));
    }
}
