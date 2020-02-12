package DS;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String args[])
    {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.addLast("Austin");
        linkedList.addFirst("Stone");
        linkedList.add(1,"COld");
        linkedList.add(2,"Steve");




        Iterator<String> iterator = linkedList.iterator();

        while (iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }



    }


}


