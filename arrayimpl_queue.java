import java.util.*;
class Queue{
    int front;
    int rear;
    int size;
    int[] arr;
    Queue(int size){
        this.size=size;
        front=0;
        rear=-1;
        arr=new int[size];

    }
     void enqueue(int e){
        if(rear==size-1){
            System.out.println("overflow");
            return;
        }
        rear++;
        arr[rear]=e;

    }
     void dequeue(){
        if(front>rear){
            System.out.println("underflow");
            return;
        }
        System.out.println("removed"+arr[front]);
        front++;
    }
    void peek(){
        if (front > rear) {
            System.out.println("Queue Empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.println(arr[front]);
        }
    }
    void display(){
    if (front > rear) {
        System.out.println("Queue Empty");
        return;
    }

    for(int i = front; i <= rear; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}
}
public class arrayimpl_queue {
    public static void main(String[] args) {
        Queue q=new Queue(4);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.peek();

        q.dequeue();

        q.peek();
        q.display();

        q.peek();
        
    }
    
}
