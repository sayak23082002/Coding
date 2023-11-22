public class CircularQueue {
    static class queue{
        static int a[];
        static int size;
        static int top;
        static int rear;

        queue(int n){
            a = new int[n];
            size = n;
            rear = -1;
            top = -1;
        }

        public boolean isEmpty(){
            return rear == -1 && top == -1;
        }

        public boolean isFull(){
            return (rear + 1) % size == top;
        }

        public void push(int n){
            if(isFull()){
                System.out.println("Array is full.");
                return;
            }
            if(top == -1)
                top = 0;
            rear = (rear + 1) % size;
            a[rear] = n;
        } 

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty.");
                return -1;
            }
            int front = a[top];
            if(rear == top)
                rear = top = -1;
            else
                top = (top + 1) % size;
            return front;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty.");
                return -1;
            }
            return a[top];
        }
    }
    public static void main(String[] args) {
        queue q = new queue(3);
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.pop());
        q.push(4);
        System.out.println(q.pop());
        q.push(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.pop();
        }
    }
}
