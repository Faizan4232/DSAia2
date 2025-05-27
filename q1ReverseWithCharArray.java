/*ALGORITHM:-
Convert the string to a character array
→ chars = input.toCharArray();
Initialize two pointers:
left = 0 (start of the array)
right = chars.length - 1 (end of the array)
Loop until left is less than right:
a. Swap chars[left] and chars[right]
b. Increment left by 1
c. Decrement right by 1
After the loop ends, the character array will be reversed.
Convert the character array back to a string and return it. */
import java.util.Scanner;

public class q1ReverseWithCharArray {

    public static String reverseString(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }
}
