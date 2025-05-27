/*ALGORITHM:
Initialize an empty stack.
Iterate through each character c in the string s:
a. If c is an opening bracket ((, {, [), push it onto the stack.
b. If c is a closing bracket (), }, ]):
Check if the stack is empty:
If yes, return false (closing bracket without a matching opening bracket).
Otherwise, pop the top element from the stack.
Check if the popped element is the matching opening bracket for c:
If not, return false.
After processing all characters, check if the stack is empty:
If empty, return true (all brackets matched correctly).
If not empty, return false (some opening brackets were not closed).
 */
import java.util.Stack;

public class q5ValidParentheses {

    public static void main(String[] args) {
        String s1 = "()[]{}";
        String s2 = "([)]";
        String s3 = "{[]}";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(')
                        || (c == '}' && top != '{')
                        || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
//TC=O(n) AND SC=O(n)
