package DS.Tree;

import java.util.LinkedList;
import java.util.Queue;

class Node
{
    int key ;
    Node left,right ;

    public Node(int key)
    {
        this.key =  key;
            left = right = null;
    }
}

public class BinaryTree {

    static Node root;

    public BinaryTree()
    {
      root = null;
    }

    public BinaryTree(int key)
    {
         root = new Node(key);
    }

    static void inorderTraversal(Node temp)
    {
        if(temp == null)
        {
            return;
        }
        inorderTraversal(temp.left);
        System.out.print(temp.key+"->");
        inorderTraversal(temp.right);
    }

    static void preOrderTraversal(Node temp)
    {
        if(temp == null)
        {
            return;
        }

        System.out.print(temp.key+"->");
        preOrderTraversal(temp.left);
        preOrderTraversal(temp.right);
    }

    static void postrderTraversal(Node temp)
    {
        if(temp == null)
        {
            return;
        }


        postrderTraversal(temp.left);
        postrderTraversal(temp.right);
        System.out.print(temp.key+"->");
    }


    static void levelOrderTraversal(Node temp){


    }


    static int height(Node root){

        if(root==null){ return 0; }
        else{
            int lHeight = height(root.left);
            int rHeight = height(root.right);

            if(lHeight>rHeight){
                return (lHeight+1);
            }
        }

        return 1;
    }






    static void insert(Node temp,int key)
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(temp);

        while (!(queue.isEmpty()))
        {
            temp = queue.peek();
            queue.remove();

            if(temp.left==null)
            {
                temp.left = new Node(key);
                break;
            }
            else
            {
                ((LinkedList<Node>) queue).add(temp.left);
            }
            if(temp.right==null)
            {
                temp.right = new Node(key);
                break;
            }
            else
            {
                ((LinkedList<Node>) queue).add(temp.right);
            }
        }
    }

    public static void main(String args[])
    {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);


        inorderTraversal(root);
        System.out.println("=======");
        preOrderTraversal(root);
        System.out.println("=======");
        postrderTraversal(root);


        }
}


