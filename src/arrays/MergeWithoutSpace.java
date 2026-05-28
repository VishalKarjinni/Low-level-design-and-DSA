package arrays;

public class MergeWithoutSpace {
    public void merge(int[] num1, int n, int[] num2, int m) {
        int i = n - 1;
        int j = m - 1;
        int k = n + m - 1;
        while (i >= 0 && j >= 0) {
           if (num1[i] > num2[j]) {
               num1[k--] = num1[i--];
           } else {
               num1[k--] = num2[j--];
           }
        }

        while (j >=0) {
            num1[k--] = num2[j--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 4, 6};
        int m = 3, n = 3;

        new MergeWithoutSpace().merge(nums1, m, nums2, n);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
