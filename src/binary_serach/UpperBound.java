package binary_serach;

public class UpperBound {
//    The upper bound algorithm finds the first or the smallest index in
//    a sorted array where the value at that index is greater than the given
//    key i.e. x.
    public static int upperBound(int[] arr, int target) {
        int high = arr.length -1;
        int low = 0;
        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int n = 5, x = 9;
        int ind = upperBound(arr, x);
        System.out.println("The lower bound is the index: " + ind);
    }
}
