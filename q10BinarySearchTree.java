/* Algorithm: Insert into BST
Input: A value key to insert into a BST.
Output: The BST with the value inserted at the correct position.
Steps:
If the tree is empty, create a new node with the key and return it as root.
If key < current node’s key, recursively insert into the left subtree.
If key > current node’s key, recursively insert into the right subtree.
If key == current node’s key, do nothing .
Return the root after insertion.
Inorder Traversal of BST
Input: Root node of a BST
Output: Values of BST printed in sorted order
If the current node is null, return.
Recursively traverse the left subtree.
Visit (print) the current node’s key.
Recursively traverse the right subtree */
class Node {

    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class q10BinarySearchTree {

    Node root;

    // Constructor
    q10BinarySearchTree() {
        root = null;
    }

    // Method to insert a new key
    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        q10BinarySearchTree bst = new q10BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
        System.out.print("Inorder traversal of BST: ");
        bst.inorder();
    }
}
//TC=O(n log n) best case 
