package StackClass;

import java.util.Stack;

public class stackClass {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static class stack{
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node newN = new Node(data);
            if(isEmpty()){
                head = newN;
                return;
            }
            newN.next = head;
            head = newN;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
        public static int size(){
            if (isEmpty())
                return 0;
            int c = 0;
            Node t = head;
            while(t != null){
                t = t.next;
                c++;
            }
            return c;
        }
    }
    public static void main(String[] args){
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Size of stack: "+s.size());
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
