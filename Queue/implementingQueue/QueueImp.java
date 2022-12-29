import java.util.LinkedList;
import java.util.Queue;

public class QueueImp {
     int [] data ;
    // the index of the front element to delete 
    int front;
    // the index of next available  position at end of queue 
    int rear ;

    QueueImp(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
    }


    public boolean isFull(){
        if(rear == data.length) return true;
        return false;
    }

    public boolean isEmpty(){
        if(front == -1) return true;
        return false;
    }

    public void enqueue(int element){
        // verify if full 
        if(isFull()){
            System.out.println("you can't add because the queue is already full");
        }else{
            if(isEmpty())   front = 0;
            rear++;
            data[rear] = element ;
        }
    }

    public int dequeue() throws IllegalStateException{
        if(isEmpty())   throw new IllegalStateException("queue is empty");
        int element = data[front];
        front++;
        return element;
    }

    public int peek (){
        if(isEmpty()) throw new IllegalStateException();
        return data[front];
    }

        
}
class Main{
    public static void main(String[] args) {
        QueueImp queueImp = new QueueImp(5);
        queueImp.enqueue(5);
        queueImp.enqueue(4);
        queueImp.enqueue(2);

        System.out.println(queueImp.dequeue()+"  "+queueImp.dequeue()+"  "+queueImp.dequeue());
    }
}
