/*Algorithm: Mirror of Binary Tree
Input: Root node of the binary tree.
Output: The tree transformed into its mirror image (left and right children swapped at every node).
Steps:
If the current node is null, return.
(Base case for recursion)
Recursively call the mirror function on the left subtree.
Recursively call the mirror function on the right subtree.
Swap the left and right children of the current node.
Return (end function). */
class Node {

    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class q8MirrorTree {

    public static void mirror(Node root) {
        if (root == null) {
            return;
        }

        // Mirror left and right subtrees
        mirror(root.left);
        mirror(root.right);

        // Swap left and right child
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.print("Original tree inorder: ");
        inorder(root);
        System.out.println();
        mirror(root);
        System.out.print("Mirror tree inorder: ");
        inorder(root);
    }
}
