package LinkedList;
public class insertDLL {
    static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
        public Node(int data, Node n, Node p){
            this.data = data;
            next = n;
            prev = p;
        }
    }
    public static Node arrToDLL(int[] arr){
        Node head = new Node(arr[0]);
        Node pre = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i],null,pre);
            pre.next = temp;
            pre = temp;
        }
        return head;
    }
    public static Node insertHead(Node head,int val){
        Node newHead = new Node(val,head,null);
        head.prev = newHead;
        head = newHead;
        return head;
    }
    public static Node insertBeforeTail(Node head,int val){
        if(head.next == null){
            return insertHead(head,val);
        }
        Node t = head;
        while(t.next != null){
            t = t.next;
        }
        Node pre = t.prev;
        Node newNode = new Node(val,t,pre);
        pre.next = newNode;
        t.prev = newNode;
        return head;
    }
    public static Node insertKth(Node head,int val,int k){
        if(k == 1)
            return insertHead(head,val);
        Node t = head;
        int c = 0;
        while(t != null){
            c++;
            if(c == k)  break;
            t = t.next;
        }
        Node pre = t.prev;
        Node newNode = new Node(val,t,pre);
        pre.next = newNode;
        t.prev = newNode;
        return head;
    }
    public static void insertNode(Node node,int val){
        Node pre = node.prev;
        Node newN = new Node(val,node,pre);
        pre.next = newN;
        node.prev = newN;
    }
    public static Node reverse(Node head){
        if(head == null || head.next == null)
            return head;
        Node cur = head;
        Node t = null;
        while(cur != null){
            t = cur.prev;
            cur.prev = cur.next;
            cur.next = t;
            cur = cur.prev;
        }
        return t.prev;
    }
    public static void print(Node head){
        Node t = head;
        while(t != null){
            System.out.println(t.data);
            t = t.next;
        }
    }


    static void main(String[] args) {
        int[] arr = {1,2,5,6};
        Node head = arrToDLL(arr);
        head = reverse(head);
        print(head);

    }
}
