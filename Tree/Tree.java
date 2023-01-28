public class Tree {
      
       public Node1 root ;

        // static void inorderTravers(Node node){
        //         if (node != null){
        //                 inorderTravers(node.left);
        //                 System.out.println(node.data);
        //                 inorderTravers(node.right);
        //         }
        // }

        // static void preOrderTraverse (Node node ){
        //         if(node != null){
        //                 System.out.println(node.data);
        //                 preOrderTraverse(node.left);
        //                 preOrderTraverse(node.right);

        //         }
        // }

        // static void postOrederTraverse(Node node){
        //         if(node != null){
        //                 postOrederTraverse(node.left);
        //                 postOrederTraverse(node.right);
        //                 System.out.println(node.data);
        //         }
        // }


        // check if a binary tree is  full 

         boolean isFullTree(Node1 node) throws Exception{
                if(node != null){
                        if(!isFullNode(node) ) {System.out.println("exception is here "); throw new Exception("exception"); };

                        isFullNode(node.left);
                        isFullNode(node.right);
                        
                }
                return true;
                
        }

         boolean isFullNode(Node1 node){
                System.out.println("left  "+node.left.data + "   right  "+ node.right.data);
                return ((node.left == null && node.right == null) || (node.left != null && node.right != null)); 
        }

    

}

class Node1 {
        public int data ;
       public  Node1 left ;
        public Node1 right; 


        public Node1 (int data ){
                this.data = data;
                left = null; right = null;
        }
}
