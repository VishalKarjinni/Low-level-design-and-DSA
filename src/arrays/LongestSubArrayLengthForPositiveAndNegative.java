package arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayLengthForPositiveAndNegative {

    public static int findLongestSubArrayBetter(int[] arr, int k) {
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }

    public static int findLongestSubArrayOptimal(int[] arr, int k) {
        int sum = 0;
        Map<Integer, Integer> mpp = new HashMap<>();
        int n = arr.length;
        int maxLen = 0;
        for (int i = 0; i < n ; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = i + 1;
            }
            int rem = sum - k;
            if (mpp.containsKey(rem)) {
                int len = i - mpp.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!mpp.containsKey(rem)) {
                mpp.put(sum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] a = { -1, 1, 1 }; // Sample input array
        int k = 1;
//        int longestSubArrayBetter = findLongestSubArrayBetter(a, k);
        int longestSubArrayOptimal = findLongestSubArrayOptimal(a, k);
        System.out.println("----->, " + longestSubArrayOptimal);
    }
}
