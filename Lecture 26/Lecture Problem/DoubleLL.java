public class DoubleLL {

    public class Node{

        int data;
        Node prev;
        Node next;

        Node(int data){

            this.data = data;
            this.prev = null;
            this.next = null;

        }

    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    public void addFirst(int data){

        Node temp = new Node(data);

        if(head == null){

            head = tail = temp;

            size = 1;

            return;

        }
        
        temp.next = head;
        
        head.prev = temp;
        
        head = temp;
        
        size++;
        
    }
    
    public void addLast(int data){
        
        Node temp = new Node(data);
    
        if(head == null){
    
            head = tail = temp;
    
            size = 1;
    
            return;
    
        }

        tail.next = temp;

        temp.prev = tail;

        tail = temp;

        size++;

    }

    public void removeFirst(){

        if(head == null){

            System.out.println("Empty");

            return;

        }

        if(head.next == null){

            head = null;

            size = 0;

            return;

        }

        head = head.next;

        head.prev = null;

        size--;

    }

    public void removeLast(){

        if(head == null){

            System.out.println("Empty");

            return;

        }

        if(head.next == null){

            head = null;

            size = 0;

            return;

        }

        tail = tail.prev;

        tail.next = null;

        size--;

    }

    public void reverse(){

        Node prev = null;

        Node curr = head;

        Node next;

        while(curr != null){

            next = curr.next;

            curr.next = prev;

            curr.prev = next;

            prev = curr;

            curr = next;

        }

        head = prev;

    }

    public void print(Node head){

        Node temp = head;

        while(temp != null){

            System.out.print(temp.data + "-><-");

            temp = temp.next;

        }

        System.out.println("null");

    }

    public static void main(String[] args){
        
        DoubleLL ll = new DoubleLL();

        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(1);
        ll.addFirst(4);

        ll.print(head);
        
        ll.removeFirst();
        
        ll.print(head);
        
        ll.addLast(4);
        
        ll.print(head);
        
        ll.removeLast();
        
        ll.print(head);

        ll.reverse();
        
        ll.print(head);

        System.out.println(size);

    }
}
