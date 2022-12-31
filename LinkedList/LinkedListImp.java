public class LinkedListImp {
    Node head;

   

    public void  add(int element){
        Node node = new Node(element);
        if(head == null){
            head = node;
        }else{
            Node temp = head ;

            while(temp.next!=null){
                temp = temp.next; 
            }
            temp.next = node;

        }
     
    }

    public Node remove(){
        if(head == null){
            throw new IllegalStateException("empty");
        }else{
            Node temp = head ;

            while(temp.next.next!=null){
                temp = temp.next; 
            }
            Node node = temp.next;
            temp.next = null;
            return node;

        }
    } 

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

}

class Node{
    int value;
    Node next;

   

    Node(int value){
        this.value = value;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return " "+value;
    }
}
