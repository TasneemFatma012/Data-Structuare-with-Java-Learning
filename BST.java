import java.util.*;
public class BST{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    static  Node insert(Node root , int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left,val);
        }
        if(root.data < val){
            root.right = insert(root.right,val);
        }

        return root;

    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + "->");
        inOrder(root.right);
    }

    public static boolean search(Node root,int keys){

        if(root == null){
            return false;
        }

        if(root.data == keys){
            return true;
        }

        if(root.data > keys){
            return search(root.left,keys);
        }

        if(root.data < keys){
            return search(root.right,keys);
        }

        return true;

        }

    public static void main(String [] args){
        int val[] = {50,30,70,20,40};
        Node root = null;
        for(int i = 0; i<val.length;i++){
            root = insert(root,val[i]);
        }
        inOrder(root);
        System.out.println();

        if(search(root,70)){
            System.out.println("Founded");
        }
        else{
            System.out.println("Not Found");
        }
    }
}