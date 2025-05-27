/*Algorithm: Insert at Beginning in Doubly Linked List
Create a new node with the given data.
If the list is empty (head is null):
Make the new node the head of the list.
Return.
Otherwise:
Set the new node’s next pointer to the current head.
Set the current head’s prev pointer to the new node.
Update the head to be the new node.
End
 */
class Node {

    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
        prev = next = null;
    }
}

public class q11DoublyLinkedList {

    Node head;

    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        q11DoublyLinkedList dll = new q11DoublyLinkedList();
        dll.insertAtBeginning(10);
        dll.insertAtBeginning(20);
        dll.insertAtBeginning(30);

        dll.printList();
    }
}//TC=O(1)
