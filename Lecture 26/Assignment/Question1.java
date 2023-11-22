public class Question1 {

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

    public static Node findJunction(Node head1, Node head2){

        Node t1 = head1;

        while(t1 != null){

            Node t2 = head2;

            while(t2 != null){

                if(t1.next == t2.next){

                    return t1.next;

                }

                t2 = t2.next;

            }

            t1 = t1.next;

        }

        return null;

    }

    public static void main(String[] args) {

        Question1 ll1 = new Question1();
        Question1 ll2 = new Question1();

        Node temp = new Node(1);
        ll1.head = temp;
        
        Node temp1 = new Node(2);
        temp.next = temp1;
        
        Node temp2 = new Node(3);
        temp1.next = temp2;
        
        Node temp3 = new Node(4);
        temp2.next = temp3;
        ll2.head = temp3;
        
        Node temp4 = new Node(5);
        temp3.next = temp4;
        
        Node temp5 = new Node(6);
        temp4.next = temp5;
        temp2.next = temp5;
        
        Node temp6 = new Node(7);
        temp5.next = temp6;
        ll1.tail = temp6;

        Node t1 = ll1.head;
        Node t2 = ll2.head;

        Node sample = findJunction(t1, t2);

        System.out.println("Junction point is: " + sample.data);

        while(t1 != null){

            System.out.print(t1.data + "->");

            t1 = t1.next;
            
        }
        System.out.println("null");
        while(t2 != null){

            System.out.print(t2.data + "->");

            t2 = t2.next;

        }

        System.out.print("null");

    }

}