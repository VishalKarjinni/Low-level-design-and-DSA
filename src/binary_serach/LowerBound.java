package binary_serach;

public class LowerBound {
    public static int lowerBound(int[] arr, int target) {
//        The lower bound algorithm finds the first or the smallest index in a sorted array where the
//        value at that index is greater than or equal to a given key i.e. x.
        int left = 0;
        int right = arr.length - 1;
        int ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int n = 5, x = 9;
        int ind = lowerBound(arr, x);
        System.out.println("The lower bound is the index: " + ind);
    }
}
