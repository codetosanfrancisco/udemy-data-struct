import java.util.*;

public class LinkedList {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node head;

    public void addFront(int data) {
        // Create new node
        Node newNode = new Node(data);

        // if head == null
        if (this.head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;
    }

    public void addBack(int data) {
        // Create new node

        Node newNode = new Node(data);

        // if head == null
        if (this.head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public int getFirst() {
        return head.data;
    }

    public void deleteValue(int data) {
        if (this.head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        // else walk the list
        Node current = head;

        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFront(100);
        ll.addBack(200);
        ll.addBack(300);
        ll.addBack(400);
        ll.addBack(500);
        ll.print();
        ll.deleteValue(300);
        ll.print();
    }
}