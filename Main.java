public class Main {
    public static void main(String[] args) {
        LinkedListImp linkedListImp = new LinkedListImp();
        linkedListImp.add(5);
        linkedListImp.add(10);
        linkedListImp.add(0);
        linkedListImp.display();

        System.out.println(linkedListImp.remove());
        linkedListImp.display();
    }
}
