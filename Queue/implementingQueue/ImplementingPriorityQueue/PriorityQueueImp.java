public class PriorityQueueImp {
    Item [] data ;
    int front,rear,SIZE;

    PriorityQueueImp(int capacity){
        data = new Item[capacity];
        front = -1;
        rear = -1;
        SIZE = capacity ;
    }
        

    public boolean isEmpty(){
        if(front ==-1)  return true;
        return false;
    }

    public void insert (Item item){
        if(isEmpty()){
            data[0] = item;
            rear++;
            front++;
            return;
        }

        // if it's not empty 
        int i ;  boolean inserted = false;

        for( i=front;i<=rear;i++){
            
            if(item.priority > data[i].priority){
                erase(i,item);
                rear++;
                inserted = true;
                break;
            }

            // else 
          
        }
        // if it's the last element 
        if(!inserted)
            data[++rear]=item;
        

        
    }

    public Item dequeue(){

        if(isEmpty()){
            throw new IllegalStateException("queue is empthy");
        }
        return data[front++];

    }


    private void erase(int index,Item item){
        Item temp = data[index];
        data[index] = item ;
        data[index+1] = temp;
        for(int i=index+2;i<rear;i++){
            data[i] =  data[i+1];
        }
    }
}

class Item{
    int value;
    int priority ;

    Item(int value,int priority){
        this.value = value;
        this.priority = priority ;
    }

    @Override
    public String toString(){
        return value+"  "+ priority ;
    }
}
