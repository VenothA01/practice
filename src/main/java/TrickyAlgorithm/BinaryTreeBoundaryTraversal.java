package TrickyAlgorithm;

public class BinaryTreeBoundaryTraversal {

    static class Node
    {
        int data ;
        Node left ;
        Node right ;

        public Node(int data)
        {
            this.data = data ;
        }

    }



    Node root ;

    void printeaves(Node node)
    {
        if(node == null)
        {
            return;
        }

        printeaves(node.left);

        if (node.left == null && node.right == null)
            System.out.print(node.data + " ");

        printeaves(node.right);
    }

    void printBoundaryLeft(Node node)
    {
        if(node == null)
        {
            return;
        }

        if(node.left != null)
        {
            System.out.println(node.data+" ");
            printBoundaryLeft(node.left);
        }
        else if( node.right != null)
        {
            System.out.println(node.data+" ");
            printBoundaryLeft(node.right);
        }

    }

    void printBoundaryRight(Node node)
    {
        if(node == null)
        {
            return;
        }

        if(node.right != null)
        {
            printBoundaryRight(node.right);
            System.out.println(node.data+" ");
        }
        else if(node.left != null)
        {
            printBoundaryRight(node.left);
            System.out.println(node.data+" ");
        }
    }

    void printBoundary(Node node)
    {
        if(node == null )
        {
            System.out.println("No tree");
            return;
        }

        System.out.print(node.data + " ");

        printBoundaryLeft(node.left);

        printeaves(node.left);
        printeaves(node.right);

        printBoundaryRight(node.right);
    }

    public static void main(String args[])
    {
        BinaryTreeBoundaryTraversal binaryTree = new BinaryTreeBoundaryTraversal();
        binaryTree.root                        = new Node(20);
        binaryTree.root.left                   = new Node(8);
        binaryTree.root.left.left              = new Node(4);
        binaryTree.root.left.right             = new Node(12);
        binaryTree.root.left.right.left        = new Node(10);
        binaryTree.root.left.right.right       = new Node(14);
        binaryTree.root.right                  = new Node(22);
        binaryTree.root.right.right            = new Node(25);

        binaryTree.printBoundary(binaryTree.root);

    }
}
