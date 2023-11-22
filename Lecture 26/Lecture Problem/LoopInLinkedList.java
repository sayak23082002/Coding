public class LoopInLinkedList {
    public static class Node {

        int data;
        Node next;

        public Node(int data) {

            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;

    public void addLast(int data) {

        // creating new node

        Node newNode = new Node(data);

        // size++;

        // pointing head and tail to the new node if the linkedlist is empty

        if (head == null) {
            head = tail = newNode;
            tail.next = head.next;
            return;
        }

        // if not then point the next pointer of the last node to the newNode

        tail.next = newNode;

        // change the tail location to the new node

        tail = newNode;

        tail.next = head.next;

    }

    public void print() {

        if (head == null) {

            System.out.println("Empty");

            return;
        
        }

        Node temp = head;

        System.out.print(temp.data + "->");

        temp = temp.next;

        while (temp != head) {

            System.out.print(temp.data + "->");

            temp = temp.next;

        }

        System.out.println("Goes on");

    }

    public boolean checkLoop(){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){

                return true;

            }
        }

        return false;

    }

    public void removeLoop(){

        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){

                cycle = true;

                break;

            }

        }

        if(!cycle){

            return;

        }

        slow = head;
    
        Node prev = fast;
    
        while(slow != fast){
    
            prev = fast;
            slow = slow.next;
            fast = fast.next;
    
        }
    
        prev.next = null;

    }

    // public void removeLoop(){

        

    //     if(checkLoop(slow, fast)){


    //     }

    // }

    public static void main(String[] args) {

        LoopInLinkedList ll = new LoopInLinkedList();

        ll.addLast(6);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        System.out.println(ll.checkLoop());
        
        ll.removeLoop();
        
        System.out.println(ll.checkLoop());

        // System.out.println(ll.checkLoop(head));

    }

}
