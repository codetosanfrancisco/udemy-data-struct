import java.util.EmptyStackException;

class Stack {
    private class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private int size;

    public void push(int data) {
        // Basically add to front/ add to top
        // Create new node
        Node newNode = new Node(data);

        // Set it's next to be head
        newNode.next = head;

        // Set head to be the new node
        head = newNode;
    }

    public int pop() {
        if (head == null) {
            throw new EmptyStackException();
        }

        int data = head.data;
        head = head.next;
        size--;

        return data;
    }
}