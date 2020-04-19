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
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.left.right = new Node(12);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);



        /**

                        1
                    2     3
                4
         **/


        System.out.println("Tree Before deletion");
        inorderTraversal(root);



        }
}


