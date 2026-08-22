import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeB {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class BinaryTree{
        int idx = -1;

        public  Node buildTree(int nodes[]){
            idx++;

            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    

     public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+ " ");
    }

    public static void levelOrder(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node CurrNode = q.remove();
            if(CurrNode == null){
                System.out.println();

                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(CurrNode.data+ " ");

                if(CurrNode.left != null){

                    q.add(CurrNode.left);

                }
                if(CurrNode.right != null){

                    q.add(CurrNode.right);

                }
            }
    }
}
}
    public static void main(String[]args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);


        // tree.preOrder(root);
        // tree.inOrder(root);
        tree.levelOrder(root);
    }

   
}
