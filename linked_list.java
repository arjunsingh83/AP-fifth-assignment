// Node class
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Singly Linked List class
class SinglyLinkedList {
    Node head;

    // Add node to the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Display the list
    public void display() {
        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Linear search in the linked list
    public boolean linearSearch(int key) {
        Node temp = head;
        int position = 0;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Element " + key + " found at position " + position);
                return true;
            }
            temp = temp.next;
            position++;
        }

        System.out.println("Element " + key + " not found in the list.");
        return false;
    }
}

// Main class to test the functionality
public class LinearSearchLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Inserting elements
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.display();

        // Searching for elements
        list.linearSearch(30); // Should find
        list.linearSearch(70); // Should not find
    }
}
