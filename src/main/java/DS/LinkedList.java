package DS;


public class LinkedList
{
    static Node  head ;
    static class Node
    {
        Node next ;
        int data ;

        Node(int data)
        {
            this.data = data;
            this.next = null;

        }
    }

    /* Inserts a new Node at front of the list. */

    static void push(int new_data)
    {
        Node newNode = new Node( new_data);

        newNode.next = head ;

        head = newNode ;
    }

    /* Inserts a new node after the given prev_node. */
    static void insertAfter(Node prevNode,int newData)
    {
        /** check if prev node is null **/
        if(prevNode == null)
        {
            System.out.println("previous Node cannot be Null");
            return ;
        }

        Node newNode = new Node(newData);

        newNode.next = prevNode.next ;
        prevNode.next = newNode ;


    }
    /* Appends a new node at the end.  This method is
       defined inside LinkedList class shown above */

    static void append(int new_data)
    {

        Node newNode = new Node(new_data);

        /** check if head is null **/
        if(head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = null;

        Node last = head ;

        while (last.next!=null)
        {
            last = last.next ;
        }

        last.next = newNode ;

    }


    /* Given a key, deletes the first occurrence of key in linked list */
    static void deleteNode(int key)
    {
        Node temp = head,prev=null ;

        /*** if key is in head **/
        if(temp!=null && temp.data==key)
        {
            head = temp.next ;
            return;
        }

        while(temp!=null && temp.data!=key)
        {
            prev = temp ;
            temp = temp.next;
        }

        while (temp == null)
        {
            System.out.println("given key is not present in the List");
            return;
        }

        prev.next = temp.next ;
    }

    /* Given a reference (pointer to pointer) to the head of a list
       and a position, deletes the node at the given position */
    static void deleteNodeAtPosition(int position)
    {
       Node temp = head ;

       if(head==null)
       {
           System.out.println("List cannot be empty");
           return;
       }

       if(position==0)
       {
           head = temp.next;
           return;
       }

       for(int i=0;temp!=null&&i<(position-1);i++)
       {
           temp = temp.next;
       }

       if(temp==null || temp.next == null)
       {
           System.out.println("Position is more than number of nodes");
           return;
       }

        Node next = temp.next.next;

       temp.next = next ;
    }

    /* Function deletes the entire linked list */
    static void deleteLinkedList(){
        head = null ;
    }

    /* Returns count of nodes in linked list */
    static int getCount()
    {
        Node temp = head;
        int count = 0 ;

        while(temp!=null)
        {
            count ++ ;
           temp =temp.next ;
        }

        return count;
    }

    /* Returns count of nodes in linked list using Recursive*/

    static int getCountRec()
    {
        Node temp = head ;
        if(temp == null)
        {
            return  0;
        }

        head = temp.next ;

        return 1+getCountRec();
    }

    //Checks whether the value x is present in linked list
    static boolean searchIterrative(Node head,int key)
    {
        Node temp = head ;

        while(temp!=null)
        {
            System.out.println("tempData::"+temp.data);
            if(temp.data == key)
            {
                System.out.println("key is present inside the List");
                return true;
            }

            temp = temp.next;
        }

        System.out.println("key is not present inside the List");
        return  false;
    }

    void printList()
    {
        System.out.println("\n");
        Node n = head ;
        while(n!=null)
        {
            System.out.print(n.data+"->");
            n = n.next ;
        }
    }

    public static void main(String args[])
    {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second ;
        second.next = third ;

        linkedList.printList();


        push(4);

        linkedList.printList();

        insertAfter(second,5);

        linkedList.printList();

        append(6);

        linkedList.printList();

        deleteNode(4);

        linkedList.printList();

        deleteNode(7);

        linkedList.printList();

        deleteNode(2);

        linkedList.printList();

        deleteNode(6);

        linkedList.printList();

        deleteNodeAtPosition(0);

        linkedList.printList();

        deleteNodeAtPosition(1);

        linkedList.printList();

        append(6);
        append(7);
        append(8);

        linkedList.printList();

        System.out.println("deleteing LinkedList");

        deleteLinkedList();

        linkedList.printList();

        append(1);
        append(2);
        append(3);
        append(4);
        append(6);
        append(7);

        linkedList.printList();

        int count = getCount();
        System.out.println("Legth of the List is "+count);

        deleteLinkedList();

        System.out.println("Legth of the List is "+getCount());

        append(11);
        append(12);
        append(13);

        linkedList.printList();
        System.out.println("Legth of the List is recursice "+getCountRec());


        searchIterrative(head,13);



    }
}