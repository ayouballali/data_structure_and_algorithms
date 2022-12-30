
public class Main {
    public static void main(String[] args) {
        PriorityQueueImp circularQueueImp = new PriorityQueueImp(4);
        circularQueueImp.insert(new Item(11, 5));
        circularQueueImp.insert(new Item(1, 5));
        circularQueueImp.insert(new Item(12, 5));

        System.out.println(circularQueueImp.dequeue()+" "+circularQueueImp.dequeue());
       

        // circularQueueImp.display();
        

   
    }
    
}
