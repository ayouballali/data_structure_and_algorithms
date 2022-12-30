public class CircularQueueImp {
    int [] data ;
    // the index of the front element to delete 
    int front;
    // the index of next available  position at end of queue 
    int rear ;
    // the size 
    int SIZE ;

    CircularQueueImp(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
        SIZE = capacity ;
    }


    public boolean isFull(){
        if(front == 0 && rear == SIZE - 1) return true;
        if(front == rear+1) return true;
        return false;
    }

    public boolean isEmpty(){
        if(front == -1) return true;
        return false;
    }
    //   . f5 r6. . . 

    public void enqueue(int element){
        // verify if full 
        if(isFull()){
            System.out.println("you can't add because the queue is already full");
        }else{
            if(isEmpty())   front = 0;
            
            rear++;
            rear%=SIZE;
            data[rear] = element ;
        }
    }

    public int dequeue() throws IllegalStateException{
        if(isEmpty())   throw new IllegalStateException("queue is empty");
        int element = data[front];
        if(front == rear){
            front = -1;
            rear = -1; 
        }else{
            front++;
            front%=SIZE;
        }
        
        return element;
    }

    public void display(){
        int i ;
        if(isEmpty())   System.out.println("the queue is empty ");
        else {
            for( i=front;i!=rear;i = (i+1)%SIZE){
                System.out.println(data[i]);
            }
            // PRINT THE LAST ELEMENT because it won't be reached 
            System.out.println(data[i]);
        }
    }

    public int peek (){
        if(isEmpty()) throw new IllegalStateException();
        return data[front];
    }

        
}

