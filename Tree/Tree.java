public class Tree {

        int data ;
        Tree left ;
        Tree right; 

        static void inorderTravers(Tree root){
                if (root != null){
                        inorderTravers(root.left);
                        System.out.println(root.data);
                        inorderTravers(root.right);
                }
        }

        static void preOrderTraverse (Tree root ){
                if(root != null){
                        System.out.println(root.data);
                        preOrderTraverse(root.left);
                        preOrderTraverse(root.right);

                }
        }

        static void postOrederTraverse(Tree root){
                if(root != null){
                        postOrederTraverse(root.left);
                        postOrederTraverse(root.right);
                        System.out.println(root.data);
                }
        }

    

}
