public class Question4 {

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

    public void checkOddEven(){

        Node oddHead = new Node(-1);
        Node evenHead = new Node(-1);

        Node odd = oddHead;
        Node even = evenHead;

        Node t = head;

        while(t != null){

            if(t.data % 2 == 0){

                even.next = t;

                even = even.next;

            }else{

                odd.next = t;

                odd = odd.next;

            }

            t = t.next;

        }

        oddHead = oddHead.next;
        evenHead = evenHead.next;

        odd.next = null;

        even.next = oddHead;

        head = evenHead;

    }

    public static void print(){

        Node temp = head;

        while(temp != null){

            System.out.print(temp.data + "->");

            temp = temp.next;

        }

        System.out.println("null");

    }

    public static void main(String[] args) {

        Question4 ll = new Question4();

        Node temp = new Node(8);
        head = temp;
        size++;
        
        Node temp1 = new Node(12);
        temp.next = temp1;
        size++;
        
        Node temp2 = new Node(10);
        temp1.next = temp2;
        size++;
        
        Node temp3 = new Node(5);
        temp2.next = temp3;
        size++;
        
        Node temp4 = new Node(4);
        temp3.next = temp4;
        size++;
        
        Node temp5 = new Node(1);
        temp4.next = temp5;
        size++;
        
        Node temp6 = new Node(6);
        temp5.next = temp6;
        size++;

        tail = temp6;
        
        print();

        // System.out.println(size);

        ll.checkOddEven();

        print();

    }
}
