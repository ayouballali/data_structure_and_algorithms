
public class Main {
    public static void main(String[] args) {
        DequeImp dq = new DequeImp(4);

        System.out.println("Insert element at rear end : 12 ");
        dq.insertRear(12);
    
        System.out.println("insert element at rear end : 14 ");
        dq.insertRear(14);
    
        System.out.println("delet rear element : " + dq.deletRear());
    
        dq.insertFront(5);
        dq.insertFront(10);
        System.out.println("After insert 5 and 10 in front element and delet : " + dq.deletFront());
    
        System.out.println("inserting element at front end");
        dq.insertFront(13);
    
       dq.insertFront(8);
       dq.insertFront(0);
    
        // dq.deletefront();
    
        // System.out.println("After delete front element new front become : " + +dq.getFront());
    

   
    }
    
}
