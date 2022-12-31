public class DequeImp {
    int [] data;
    int front,rear ;
    int SIZE ;
    DequeImp(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
        SIZE = capacity;
    }
        // . . . . .
    public boolean isEmpty(){
        if(front == -1) return true;
        return false;
    }
// . . . . .
    public boolean isFull(){
        if(front==0 && rear == SIZE-1 || rear+1 == front  ) return true;
        return false;
    }
    public void  insertFront(int element){
        if(isEmpty()){
            front ++;
            rear++;
            data[front] = element;
            return;
        }
        // is full 
        if(isFull())
            throw new IllegalStateException("deque is full");

        if(front-1 == -1){
            front = SIZE - 1;
        }else{
            front--;
        }
        data[front] = element;

    }

    public void  insertRear(int element){
        if(isEmpty()){
            front ++;
            rear++;
            data[front] = element;
            return;
        }
              // is full 
        if(isFull())
            throw new IllegalStateException("deque is full");

        if(rear+1 == SIZE){
            rear = 0;
        }else rear++;

        data[rear] = element ;
    }

    public int deletFront(){
        if(isEmpty())   throw new IllegalStateException("deque is qlready empty");
        int element  = data[front];
        if(rear == front) {front = 0;rear =0;}
        if(front+1 == SIZE) front = 0;
        else    front++;

        return element ;
    }

    public int deletRear(){
        if(isEmpty())   throw new IllegalStateException("deque is qlready empty");
        int element  = data[rear];
        if(rear == front) {front = 0;rear =0;}
        if(rear-1 == -1) rear = SIZE - 1;
        else    rear--;

        return element ;
    }
}
