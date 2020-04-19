package DS;

public class DoubleLinkedList {

    Node head ;

    static class Node{
        int data;
        Node next ;
        Node prev ;

        public Node(int data){
            this.data = data;
            next = null;
            prev=null;
        }
    }

     void append(int data){

        Node new_node   = new Node(data);
        Node last       = head;

        new_node.next = null;

        if(head==null){
            new_node.prev=null;
            head = new_node;
            return;
        }

        while (last.next!=null){
            last = last.next;
        }

        last.next = new_node;
        new_node.prev = last;
    }

    void push(int data){

        Node new_node = new Node(data);

        new_node.next = head;
        new_node.prev = null;


        if(head!=null){
            head.prev = new_node;
        }

        head = new_node;
    }

    void insertAfter(Node prev_node,int data)
    {
        if(prev_node==null)
        {
            System.out.println("The previous node cannot be null");
            return;
        }

        Node new_node = new Node(data);

        new_node.next = prev_node.next;
        new_node.prev = prev_node;

        prev_node.next = new_node;

        if(new_node.next!=null)
        {
            new_node.next.prev = new_node;
        }

    }


    static Node reverseDLL(Node node)
    {

        Node temp = node.next ;
        node.next = node.prev ;
        node.prev = temp ;

        if(node==null)
        {
            return node;
        }

        return reverseDLL(node.prev);


    }

    void prinlList(Node node)
    {
        Node last = null;
        System.out.println("Traversal in forward direction");

        while(node!=null)
        {
            System.out.print(node.data+"->");
            last=node;
            node = node.next;

        }
        System.out.print("NULL");
        System.out.println("-----------------");
        System.out.println("Traversal in forward direction");
        System.out.print("<-NULL");
        while (last!=null){
            System.out.print("<-"+last.data);
            last = last.prev;
        }

    }

    public static void main(String args[]){

        DoubleLinkedList dll = new DoubleLinkedList();

        dll.append(6); //6->NULL
        dll.push(7); //7->6->NULL
        dll.push(1); //1->7->6->NULL
        dll.append(4); //1->7->6->4->NULL
        dll.insertAfter(dll.head.next, 8); // 1->7->8->6->4

        System.out.println("Created DLL is: ");
        dll.prinlList(dll.head);

        System.out.println();
        System.out.println("Reversing the DLL...");
        reverseDLL(dll.head);
        dll.prinlList(dll.head);



    }

}
