/*Algorithm: Rotate Array Right by k Positions Using Reverse Method
Input:
Array arr of length n
Integer k (number of positions to rotate)
Output:
Array rotated right by k positions
Steps:
Normalize k by taking k = k % n to handle cases where k is greater than the length of the array.
Reverse the entire array:
Reverse elements from index 0 to n-1.
After this step, the array is completely reversed.
Reverse the first k elements:
Reverse elements from index 0 to k-1.
This step moves the last k elements (which are now at the front) into the correct order.
Reverse the remaining elements:
Reverse elements from index k to n-1.
This step moves the first n-k elements (which are now at the back) into the correct order.
The array is now rotated to the right by k positions. */

import java.util.Arrays;

public class q5ArrayRotation {

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(arr, k);
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }

}
