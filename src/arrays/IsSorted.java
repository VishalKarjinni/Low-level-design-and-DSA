package arrays;

public class IsSorted {
    public boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        IsSorted sorted = new IsSorted();
        int[] arr = {3, 4, 5, 6, 7, 8, 3};
        System.out.println(sorted.isSorted(arr) + "---------> ");
    }
}
