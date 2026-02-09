package stack;

import java.util.Arrays;
import java.util.Stack;

public class StackSpanProblem {
    public static int[] findNGEIndex(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            int curEle = arr[i];
            while (!st.isEmpty() && arr[st.peek()] <= curEle) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {120, 100, 60, 80, 90, 110, 115};
        int[] ngeIndex = findNGEIndex(arr);
        int[] ans = new int[arr.length];
        for (int i=0; i < arr.length; i++) {
            ans[i] = i - ngeIndex[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
