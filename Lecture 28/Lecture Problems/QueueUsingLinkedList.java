public class QueueUsingLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static Node Queuehead = null;
    public static Node Queuetail = Queuehead;

    public boolean isEmpty(){
        return Queuehead == null && Queuetail == null;
    }

    public void push(int n){
        Node t = new Node(n);
        if(isEmpty()){
            Queuehead = Queuetail = t;
            return;
        }
        Queuetail.next = t;
        Queuetail = t;
    }
    
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return -1;
        }
        int n = Queuehead.data;
        if(Queuehead == Queuetail)
            Queuehead = Queuetail = null;
        else
            Queuehead = Queuehead.next;
        return n;
    }
    
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return -1;
        }
        return Queuehead.data;
    }

    public static void main(String[] args) {
        QueueUsingLinkedList ll = new QueueUsingLinkedList();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);
        ll.push(6);
        ll.push(7);
        ll.push(8);
        // while(!ll.isEmpty()){
            //     System.out.println(ll.peek());
            //     ll.pop();
            // }
        System.out.println(ll.pop());
        System.out.println(ll.pop());
        System.out.println(ll.pop());
        System.out.println(ll.pop());
        System.out.println(ll.pop());
        System.out.println(ll.pop());
        // ll.pop();
        // ll.pop();
        // ll.pop();
        // ll.pop();
        // ll.pop();
        // ll.pop();
        ll.push(9);
        System.out.println(ll.pop());
        System.out.println(ll.pop());
        System.out.println(ll.pop());
        System.out.println(ll.pop());
        // ll.pop();
        // ll.pop();
    }
}
