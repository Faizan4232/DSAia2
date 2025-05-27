/*Initialize an empty string result to store characters without duplicates.
Loop through each character current in the input string str (index i from 0 to str.length() - 1):
For each character:
a. Check if current is NOT present in result:
Use result.indexOf(current) which returns -1 if current is not found.
b. If current is not found in result:
Append current to the result string.
c. If current is already in result:
Skip adding it (ignore duplicates).
After the loop ends, result contains the input string’s characters with duplicates removed, preserving their first occurrence order.
Return the result string. */
public class q2RemoveDuplicatesEasy {

    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (result.indexOf(current) == -1) {
                result += current;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);
    }
}
//tc=O(n)
