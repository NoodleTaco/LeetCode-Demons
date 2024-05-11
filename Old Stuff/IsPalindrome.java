import java.util.Queue;
import java.util.Stack;

class Solution {
    public static boolean isPalindrome(String s) {
        Stack<String> stack = new Stack();
        
        Queue<String> queue = new LinkedList<String>();

        for (int i = 0; i < s.length(); i++)
        {
            if (Character.isLetterOrDigit(s.charAt(i)))
            {
                String letter =  String.valueOf(s.charAt(i));
                stack.push(letter.toLowerCase());
                queue.add(letter.toLowerCase());
            }
        }

        while((!stack.isEmpty())&&(!queue.isEmpty()))
        {
            if(stack.peek().equals(queue.peek()))
            {
                stack.pop();
                queue.remove();
            }
            else
            {
                return false;
            }
        }

        if((stack.isEmpty() && !queue.isEmpty()) || (!stack.isEmpty() && queue.isEmpty()))
        {
            return false;
        }
        
        return true;
        
    }

}