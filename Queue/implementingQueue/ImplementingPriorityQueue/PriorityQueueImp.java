public class PriorityQueueImp {
    Item [] data ;
    int idx,SIZE;

    PriorityQueueImp(int capacity){
        data = new Item[capacity];
        idx = -1;
        SIZE = capacity ;
    }
        

    public boolean isEmpty(){
        if(idx == -1)  return true;
        return false;
    }

    public void insert (Item item){
        if(isEmpty()){
            data[0] = item;
            idx++;
            return;
        }

        // if it's not empty 
        int i ;
        idx++;

        for( i=idx-1;i>=0;i--){
            
            if(item.priority <= data[i].priority){
               
                data[i+1] = data[i];
                data[i] = item;
                
            }else{
                data[i+1] = item ;
                break;
            }

            
          
        }
     
        
        

        
    }

    public Item dequeue(){

        if(isEmpty()){
            throw new IllegalStateException("queue is empthy");
        }
        return data[idx--];

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
