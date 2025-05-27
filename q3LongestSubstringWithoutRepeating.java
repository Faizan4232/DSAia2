/*ALGORITHM:
 Initialize:
An empty HashSet set to store characters in the current window (substring).
Two pointers:
start = 0 (left boundary of the sliding window)
end (right boundary, will iterate through the string)
maxLength = 0 to keep track of the longest substring length found.
Iterate over each character current in the string using the end pointer:
a. While the character current is already in the set (means duplicate found in the current window):
Remove the character at start index from the set.
Increment start by 1 (shrink the window from the left to remove duplicate).
b. Add the current character current to the set.
c. Calculate the length of the current substring:
windowLength = end - start + 1
d. Update maxLength if windowLength is greater than current maxLength.
After processing all characters, return maxLength.
Example walkthrough with s = "abcabcbb"
 */
import java.util.HashSet;

public class q3LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int start = 0;
        HashSet<Character> set = new HashSet<>();
        for (int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);
            while (set.contains(current)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(current);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Longest substring length: " + lengthOfLongestSubstring(input));
    }
}
//TC=O(n) and SC=O(n,m)
