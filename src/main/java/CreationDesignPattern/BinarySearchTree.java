package CreationDesignPattern;

class Node {

    public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearchTree {
    static boolean flag ;

    public static boolean contains(Node node, int value) {
        // Base Cases: root is null or key is present at root



        if (node == null )
        {
            System.out.println(node.value);
            return false ;
        }

        else if(node.value == value)
        {
            flag = true ;
        }
        // val is greater than root's key
        else if (value > node.value) {
            contains(node.right, value) ;
        }
        // val is less than root's key
        else if(value < node.value) {
            contains(node.left, value);
        }
        else
        {
            flag = false ;
        }

        return flag ;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);

        System.out.println(contains(n2, 3));
    }
}