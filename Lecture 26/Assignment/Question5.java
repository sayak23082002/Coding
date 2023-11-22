public class Question5 {

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

    public Node findMid(Node head){

        Node fast = head.next;
        Node slow = head;

        while(fast != null && fast.next != null){

            slow = slow.next;

            fast = fast.next.next;

        }
        
        return slow;
        
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

        Question5 ll = new Question5();

        Node temp1 = new Node(1);
        head = temp1;
        Node temp2 = new Node(3);
        temp1.next = temp2;
        Node temp3 = new Node(6);
        temp2.next = temp3;
        Node temp4 = new Node(8);
        temp3.next = temp4;
        Node temp5 = new Node(9);
        temp4.next = temp5;
        Node temp6 = new Node(10);
        temp5.next = temp6;

        ll.mergeSort(head);

        ll.print();

    }

}
