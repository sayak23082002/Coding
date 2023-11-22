public class Question2 {
    public static class Node {

        int data;
        Node next;

        public Node(int data) {

            this.data = data;
            this.next = null;

        }
    }

    public Node head;
    public Node tail;

    public static Node removeNodes(int i, int n, Node head) {

        Node t = head;

        while (t.next != null) {
            
            for (int k = 1; k <= i; k++) {

                t = t.next;

            }

            int temp = n;

            while (temp > 0) {

                if(t.next != null)

                    t.next = t.next.next;

                temp--;

            }

        }

        return head.next;

    }

    public static void main(String[] args) {

        Question2 ll = new Question2();

        Node temp = new Node(1);
        ll.head = temp;

        Node temp1 = new Node(2);
        temp.next = temp1;

        Node temp2 = new Node(3);
        temp1.next = temp2;

        Node temp3 = new Node(4);
        temp2.next = temp3;

        Node temp4 = new Node(5);
        temp3.next = temp4;

        Node temp5 = new Node(6);
        temp4.next = temp5;

        Node temp6 = new Node(7);
        temp5.next = temp6;

        Node temp7 = new Node(8);
        temp6.next = temp7;

        Node temp8 = new Node(9);
        temp7.next = temp8;

        Node temp9 = new Node(10);
        temp8.next = temp9;

        ll.tail = temp9;
        
        Node t = new Node(-1);
        t.next = ll.head;
        ll.head = t;

        ll.head = removeNodes(3, 2, ll.head);

        Node tmp = ll.head;

        while (tmp != null) {

            System.out.print(tmp.data + "->");

            tmp = tmp.next;

        }

        System.out.println("null");

    }

}
