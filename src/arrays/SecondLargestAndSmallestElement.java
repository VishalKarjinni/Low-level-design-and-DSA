package arrays;

public class SecondLargestAndSmallestElement {
    int secondSmall = Integer.MAX_VALUE;
    int small = Integer.MAX_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    int largest = Integer.MIN_VALUE;

    public int secondSmallest(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            } else if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }
        return secondSmall;
    }

    public int secondLargest(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 1, 7, 10, 11};
        SecondLargestAndSmallestElement secondLargestAndSmallestElement = new SecondLargestAndSmallestElement();
        System.out.println("Second Largest Number is : " + secondLargestAndSmallestElement.secondLargest(arr) + " Second Smallest Number is : " + secondLargestAndSmallestElement.secondSmallest(arr));
    }
}
