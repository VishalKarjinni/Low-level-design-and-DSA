package arrays;

public class LongestSubArrayLength {
    // Longest subarray Length is equal to k
    public static int longestSubArrayBrute(int[] arr, int k) {
        int n = arr.length;
        int maxLength = 0;
        for (int startIndex = 0; startIndex < n; startIndex++) {
            for (int endIndex = startIndex; endIndex < n; endIndex++) {
                int currentSum = 0;
                for (int i = startIndex; i <= endIndex; i++) {
                    currentSum += arr[i];
                }
                if (currentSum == k) {
                    maxLength = Math.max(maxLength, endIndex - startIndex + 1);
                }
            }
        }
        return maxLength;
    }

    public static int longestSubArrayOptimal(int[] arr, int k) {
        int n = arr.length;
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int maxLength = 0;
        while (right < n) {
          while (left <= right && sum > k) {
              sum -= arr[left];
              left++;
          }
          if (sum == k) {
              maxLength = Math.max(maxLength, right - left + 1);
          }
          right++;
          if (right < n) {
              sum += arr[right];
          }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
//        int longestSubArray = longestSubArrayBrute(arr, 15);
        int longestSubArray = longestSubArrayOptimal(arr, 15);
        System.out.println(" " + longestSubArray + " ");
    }
}
