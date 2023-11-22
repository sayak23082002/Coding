public class Question3 {

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

    public void swap(int i1, int i2) {

        if(i1 == i2){

            return;

        }

        Node t = new Node(-1);

        t.next = head;

        head = t;

        Node temp1 = head;
        Node temp2 = head;

        for (int k = 1; k <= i1 - 1; k++) {

            temp1 = temp1.next;

        }

        Node t1 = temp1;
        temp1 = temp1.next;
        Node t2 = temp1.next; 

        for (int k = 1; k <= i2 - 1; k++) {

            temp2 = temp2.next;

        }

        Node t3 = temp2;
        temp2 = temp2.next;
        Node t4 = temp2.next;

        t1.next = temp2;
        t3.next = temp1;
        temp1.next = t4;

        head = head.next;

        if(i1 - i2 == 1 || i1 - i2 == -1){

            temp2.next = t3;

            return;

        }

        temp2.next = t2;

    }

    public static void main(String[] args) {

        Question3 ll = new Question3();

        Node temp = new Node(1);
        head = temp;

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

        tail = temp9;

        Node tmp = head;

        while (tmp != null) {

            System.out.print(tmp.data + "->");

            tmp = tmp.next;

        }

        System.out.println("null");

        ll.swap(1, 2);

        temp = head;

        while (temp != null) {

            System.out.print(temp.data + "->");

            temp = temp.next;

        }

        System.out.println("null");

    }
}