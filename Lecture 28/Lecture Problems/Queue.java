public class Queue {
    static class queue{
        static int a[];
        static int size;
        static int rear;

        queue(int n){
            a = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty(){
            return rear == -1;
        }

        public void push(int n){
            if(rear == a.length - 1){
                System.out.println("Array is full.");
                return;
            }
            a[++rear] = n;
        } 

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty.");
                return -1;
            }
            int front = a[0];
            for(int k = 1; k < size; k++){
                a[k - 1] = a[k];
            }
            rear--;
            return front;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty.");
                return -1;
            }
            return a[0];
        }
    }
    public static void main(String[] args) {
        queue q = new queue(4);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.pop();
        }
    }
}