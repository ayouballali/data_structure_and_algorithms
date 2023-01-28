public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.left = new Node1(4);
        tree.root.left.right = new Node1(5);
        tree.root.right.left = new Node1(6);
        tree.root.right.right = new Node1(7);
        tree.root.left.left.left = new Node1(8);

    try{
        tree.isFullTree(tree.root);
    }catch(Exception e){
        System.out.println("NO");
        return ;
    }
      
          System.out.println("YES");
        
    }
}

