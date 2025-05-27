/*Algorithm for Tree Traversals (Recursive)
1. Inorder Traversal (Left, Root, Right)
Function: inorder(node)
Input: current node (root of subtree)
Steps:
If node is null, return (do nothing).
Recursively call inorder(node.left) to visit the left subtree.
Visit (process/print) the current node's data.
Recursively call inorder(node.right) to visit the right subtree.
2. Preorder Traversal (Root, Left, Right)
Function: preorder(node)
Input: current node
Steps:
If node is null, return.
Visit (process/print) the current node's data.
Recursively call preorder(node.left).
Recursively call preorder(node.right).
3. Postorder Traversal (Left, Right, Root)
Function: postorder(node)
Input: current node
Steps:
If node is null, return.
Recursively call postorder(node.left).
Recursively call postorder(node.right).
Visit (process/print) the current node's data. */
class Node {

    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class q7TreeTraversal {

    // Inorder traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Preorder traversal
    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder traversal
    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.print("Inorder traversal: ");
        inorder(root);

        System.out.print("\nPreorder traversal: ");
        preorder(root);

        System.out.print("\nPostorder traversal: ");
        postorder(root);
    }
}
//TC=O(n)
