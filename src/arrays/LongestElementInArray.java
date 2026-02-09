package arrays;

public class LongestElementInArray {
    public int longestElementInArray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        LongestElementInArray elementInArray = new LongestElementInArray();
        int[] arr = {3, 5, 10, 8, 11, 9, 10};
        int maxNumberFromElemnt = elementInArray.longestElementInArray(arr);
        System.out.println(maxNumberFromElemnt + " -------> ");
    }
}
