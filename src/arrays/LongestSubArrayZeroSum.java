package arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayZeroSum {
    public int solve(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxLength = i + 1;
            } else {
                if (mpp.containsKey(sum)) {
                    maxLength = Math.max(maxLength, i - mpp.get(sum));
                } else {
                    mpp.put(sum, i);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] A = new int[]{9, -3, 3, -1, 6, -5};
        LongestSubArrayZeroSum longestSubArrayZeroSum = new LongestSubArrayZeroSum();
        int maxi = longestSubArrayZeroSum.solve(A);
        System.out.println(maxi + ",");
    }
}
