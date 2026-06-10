import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class Queue{
    Node front;
    Node rear;
    void enqueue(int e){
        Node newnode=new Node(e);
        if(rear==null){
            front=rear=newnode;
            return;
        }
        rear.next=newnode;
        rear=newnode;

    }
    void dequeue(){
        if(front==null) return;
        System.out.println("removed: "+front.data);
        front=front.next;
        if(front==null){
            rear=null;
        }

    }
    void peek(){
        if(front==null) return;
        System.out.println(front.data);

    }
    void display(){
        Node temp=front;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

}
public class llimpl_queue {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.dequeue();
        q.peek();
        q.display();
        
    }
    
}
