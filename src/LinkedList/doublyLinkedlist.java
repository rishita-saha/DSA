package LinkedList;

public class doublyLinkedlist {
    static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
        public Node(int data,Node n,Node p){
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

    public static Node deleteHead(Node head){
        if(head == null || head.next == null)
                return null;
        Node pre = head;
        head = head.next;
        head.prev = null;
        pre.next = null;
        return head;
    }

    public static Node deleteTail(Node head){
        if(head == null || head.next == null)
            return null;
        Node t = head;
        while(t.next != null){
            t = t.next;
        }
        Node pre = t.prev;
        pre.next = null;
        t.prev = null;
        return head;
    }

    public static Node deleteKth(Node head,int k){
        Node t = head;
        int c = 0;
        while(t != null){
            c++;
            if(c == k)  break;
            t = t.next;
        }
        Node pre = t.prev;
        Node nxt = t.next;
        if(pre == null && nxt == null)
                return null;
        else if (pre == null) {
            head = deleteHead(head);
            return head;
        } else if (nxt == null) {
            head = deleteTail(head);
            return head;
        }else {
            pre.next = nxt;
            nxt.prev = pre;
            t.next = null;
            t.prev = null;
            return head;
        }
    }

    public static void deleteNode(Node temp){
        Node pre = temp.prev;
        Node nxt =  temp.next;
        if(nxt == null){
            pre.next = null;
            temp.prev = null;
        }else{
            pre.next = nxt;
            nxt.prev = pre;
            temp.next = null;
            temp.prev = null;
        }
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
        //head = deleteKth(head,3);
        deleteNode(head.next.next.next);
        print(head);

    }
}
