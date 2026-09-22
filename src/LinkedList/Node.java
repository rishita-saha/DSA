package LinkedList;

public class Node {
    int data;
    Node next = null;
    Node(int d){
        data = d;

    }
    public static void main() {
        Node head = new Node(78);
        Node temp = head;

        temp.next = new Node(432);
        temp = temp.next; 
    }
}
