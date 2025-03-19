/**
 * Linked_List.java
 *
 * A Java program to implement a singly linked list with methods to:
 * - Insert a node at the beginning
 * - Insert a node at the end
 * - Delete a node from the beginning
 *
 * Ensure that your code is well-commented and follows good programming practices.
 */

 public class Linked_List {

    /**
     * Node class represents each element in the linked list.
     */
    private static class Node {
        int data;   // The data stored in the node
        Node next;  // Pointer to the next node in the list

        /**
         * Constructor to create a new node with the given data.
         * @param data The integer value to store in the node.
         */
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // The head of the linked list

    /**
     * Constructor to initialize an empty linked list.
     */
    public Linked_List() {
        head = null;
    }

    /**
     * Inserts a new node at the beginning of the linked list.
     *
     * @param data The integer value to insert.
     */
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Link the new node to the current head
        head = newNode;      // Update head to the new node
    }

    /**
     * Inserts a new node at the end of the linked list.
     *
     * @param data The integer value to insert.
     */
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            // If the list is empty, new node becomes the head
            head = newNode;
        } else {
            // Traverse to the end of the list
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            // Link the last node to the new node
            current.next = newNode;
        }
    }

    /**
     * Deletes the node at the beginning of the linked list.
     * If the list is empty, a message is displayed.
     */
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty. Nothing to delete.");
        } else {
            // Update head to the next node, effectively removing the first node
            head = head.next;
        }
    }

    /**
     * Utility method to print the linked list.
     */
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    /**
     * Main method for basic testing of the linked list operations.
     */
    public static void main(String[] args) {
        Linked_List list = new Linked_List();

        // Inserting nodes at the beginning
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);

        // Inserting a node at the end
        list.insertAtEnd(30);

        // Print the current list: Expected output: 20 -> 10 -> 30 -> null
        System.out.println("Linked List after insertions:");
        list.printList();

        // Delete the node at the beginning
        list.deleteFromBeginning();

        // Print the updated list: Expected output: 10 -> 30 -> null
        System.out.println("Linked List after deletion from beginning:");
        list.printList();
    }
}
