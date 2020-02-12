package TrickyAlgorithm;

import java.util.Stack;

public class GFG {

    static Stack<Character> stack ;

    static boolean checkMatchingPair(char c,char peekCharacter)
    {
        boolean isMatchingPair ;
        if(c == '}' || peekCharacter == '{')
        {
            isMatchingPair = true;
        }
        else if(c == ']' || peekCharacter == '[')
        {
            isMatchingPair = true ;
        }
        else  if(c == ')' || peekCharacter == '(')
        {
            isMatchingPair = true ;
        }
        else
        {
            isMatchingPair = false ;
        }

        return  isMatchingPair ;
    }

    static boolean checkBalanced(String str)
    {
        stack   = new Stack<Character>();
        boolean isBalanced  = false;
        int strLen  = str.length();
        int idx  = 0;


        for(idx=0;idx<strLen;idx++)
        {
            if(str.charAt(idx)=='[' || str.charAt(idx)=='{' || str.charAt(idx)=='{' )
            {

                stack.push(str.charAt(idx));
            }
            if(str.charAt(idx)==']' || str.charAt(idx)=='}' || str.charAt(idx)==')' )
            {
                /** check if the stack is empty **/
                if(stack.empty()) {
                        return  false ;
                }

                isBalanced = checkMatchingPair(str.charAt(idx),stack.peek()) ;

            }
        }

        return isBalanced ;
    }
    public static void main(String args[])
    {
        String str          = "[(])";
        if(checkBalanced(str))
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not Balanced");
        }

    }
}
