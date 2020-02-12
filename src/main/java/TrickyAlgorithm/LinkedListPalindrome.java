package TrickyAlgorithm;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPalindrome {

    static LinkedList<Character> linkedList = new LinkedList<Character>();

    static LinkedList<Character> pushtoList(char[] str) {

        for (int idx = 0; idx < str.length; idx++) {
            linkedList.add(idx, str[idx]);

        }

        return linkedList;

    }


    public static void main(String args[]) {
        LinkedListPalindrome linkedList = new LinkedListPalindrome();

        char str[] = {'a', 'b', 'a', 'c', 'a', 'b', 'a'};
        int midPoint = str.length / 2;

        if (midPoint % 2 == 0) {
            int localLoop = 0;
            while (localLoop < str.length - 1) {
                if (str[midPoint - 1] == str[midPoint + 1]) {

                }
            }

        }
    }
}
