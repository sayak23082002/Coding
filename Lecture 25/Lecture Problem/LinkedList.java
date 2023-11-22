public class LinkedList {

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
    public static int size;

    public void addFirst(int data) {

        // creating new node

        Node newNode = new Node(data);

        size++;

        // pointing head and tail to the new node if the linkedlist is empty

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // if not then point the next pointer of the new node to the head

        newNode.next = head;

        // change the head location to the new node

        head = newNode;

    }

    public void addLast(int data) {

        // creating new node

        Node newNode = new Node(data);

        size++;

        // pointing head and tail to the new node if the linkedlist is empty

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // if not then point the next pointer of the last node to the newNode

        tail.next = newNode;

        // change the tail location to the new node

        tail = newNode;

    }

    public void addAtIndex(int i, int data){

        if(i == 0){

            addFirst(data);

            return;

        }

        if (head == null) {

            System.out.println("Empty");

            return;

        }

        Node temp = head;

        int k = 1;

        while(k < i){

            temp = temp.next;

            k++;

        }

        Node newNode = new Node(data);

        size++;

        newNode.next = temp.next;        
        
        temp.next = newNode;

    }

    public void removeFirst(){

        if(size == 0){

            System.out.println("Empty");

            return;

        }else{

            if(size == 1){

                head = tail = null;

                size = 0;

                return;

            }
        }

        head = head.next;

        size--;

    }

    public void removeLast(){
        if(size == 0){

            System.out.println("Empty");

            return;

        }else{
            if(size == 1){

                head = tail = null;

                size = 0;

                return;

            }
        }

        Node temp = head;

        for(int i = 0; i < size - 2; i++)

            temp = temp.next;

        temp.next = null;

        tail = temp;

        size--;

    }

    public int iterativeSearch(int data){

        Node temp = head;

        int count = 1;

        while(temp != null){

            if(temp.data == data){

                return count;

            }

            count++;

            temp = temp.next;

        }

        return -1;

    }

    public int recursiveSearch(Node head, int data){

        if(head == null)
            return -1;

        if(head.data == data)
            return 1;

        int temp = recursiveSearch(head.next, data);
            
        if(temp == -1)
            return -1;

        return temp + 1;

    }

    public void reverse(){

        Node prev = null;
        
        Node curr = tail = head;

        Node next;

        while(curr != null){

            next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;

        }

        head = prev;

    }

    public void deleteFromLast(int i){

        Node temp = head;

        int t = 1;

        while( t < (size - i)){

            temp = temp.next;

            t++;

        }

        temp.next = temp.next.next;

    }

    public Node findMid(Node head){

        Node fast = head.next;
        Node slow = head;

        while(fast != null && fast.next != null){

            slow = slow.next;

            fast = fast.next.next;

        }
        
        return slow;
        
    }

    public boolean checkPalindrom(){

        if(head == null || head.next == null){
            return true;
        }

        //step1 - find mid

        Node midNode = findMid(head);

        //step2 - reverse 2nd half

        Node prev = null;
    
        Node curr = midNode;
    
        Node next;

        while(curr != null){
    
            next = curr.next;
    
            curr.next = prev;
    
            prev = curr;
    
            curr = next;
    
        }

        Node right = prev;
        Node left = head;

        //step3 - check left and right half
        
        while(right != null && left != null){
    
            if(right.data != left.data){
                
                return false;
                
            }

            right = right.next;
            left = left.next;
    
        }

        return true;

    }

    public boolean checkLoop(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){

                return true;

            }

        }

        return false;

    }

    public Node merge(Node leftHead, Node rightHead){

        Node mergedLL = new Node(-1);

        Node temp = mergedLL;

        while(leftHead != null && rightHead != null){

            if(leftHead.data <= rightHead.data){

                temp.next = leftHead;

                leftHead = leftHead.next;
                
                temp = temp.next;
                
            }else{
                
                temp.next = rightHead;

                rightHead = rightHead.next;
                
                temp = temp.next;

            }
            
        }
        
        while(leftHead != null){
            
            temp.next = leftHead;
            
            leftHead = leftHead.next;

            temp = temp.next;
            
        }
        
        while(rightHead != null){
            
            temp.next = rightHead;
            
            rightHead = rightHead.next;

            temp = temp.next;
            
        }

        return mergedLL.next;

    }

    public Node mergeSort(Node head){

        if(head == null || head.next == null)
            return head;

        //find mid

        Node mid = findMid(head);

        //call left and right half of the list

        Node rightHead = mid.next;

        mid.next = null;

        Node newLeft = mergeSort(head);

        Node newRight = mergeSort(rightHead);

        //merge

        return merge(newLeft, newRight);

    }

    public Node zigzag(Node head){

        //find mid

        Node temp = findMid(head);

        //reverse 2nd half

        Node prev = null;

        Node curr = temp;

        Node next;

        while(curr != null){

            next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;

        }

        //merge in zig zag way

        Node LH = head;

        Node RH = prev;

        Node nextL, nextR;

        while(LH != null && RH != null){

            nextL = LH.next;

            LH.next = RH;

            nextR = RH.next;

            RH.next = nextL;

            RH = nextR;

            LH = nextL;

        }

        return head;

    }

    public void print() {

        if (head == null) {

            System.out.println("Empty");

            return;
        
        }

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.data + "->");

            temp = temp.next;

        }

        System.out.println("null");

    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.addLast(6);
        ll.addLast(5);

        ll.print();
        
        head = ll.zigzag(head);
        
        ll.print();
        
        // ll.addAtIndex(3, 4);
        // ll.addAtIndex(0, 0);
        
        // ll.print();

        // ll.removeFirst();
        
        // ll.print();
        
        // ll.removeLast();
        
        // ll.print();

        // ll.reverse();
        
        // ll.print();

        // ll.deleteFromLast(2);
        
        // ll.print();

        // System.out.println(ll.checkLoop(head));

        // if(ll.checkPalindrom())

        //     System.out.println("Palindrom");
        // else
        
        //     System.out.println("Not Palindrom");

        // System.out.println("The element has found at the index: " + ll.iterativeSearch(4));
        
        // System.out.println("The element has found at the index: " + ll.recursiveSearch(head, 4));

        // System.out.println("The size of the linked list is: " + size);

    }
}