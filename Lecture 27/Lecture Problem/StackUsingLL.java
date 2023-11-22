public class StackUsingLL {
    static class Node{

        int data;

        Node next;

        Node(int data){

            this.data = data;

            this.next = null;

        }

    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    static class stack{

        public static boolean isEmpty(){

            return head == null;

        }

        public static void push(int data){

            Node t = new Node(data);

            if(isEmpty()){

                head = t;

                return;

            }

            t.next = head;

            head = t;

        }

        public static int pop(){

            if(isEmpty()){

                return -1;

            }

            int t = head.data;

            head = head.next;

            return t;

        }

        public static int peek(){

            if(isEmpty()){

                return -1;

            }

            return head.data;

        }

    }

    public static void main(String[] args) {
        
        stack ll = new stack();

        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);

        while(!ll.isEmpty()){

            System.out.println(ll.peek());
            ll.pop();

        }

    }

}