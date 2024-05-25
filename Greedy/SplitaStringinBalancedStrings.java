import java.util.*;
public class SplitaStringinBalancedStrings {
    public class Solution {
        public int balancedStringSplit(String s) {
            Stack<Character> charStack = new Stack<>();

            int count = 0;

            char[] charArr = s.toCharArray();

            for(char currChar: charArr){
                if(charStack.isEmpty() || charStack.peek() == currChar){
                    charStack.add(currChar);
                }
                else{
                    charStack.pop();
                }

                if(charStack.isEmpty()){
                    count ++;
                }
            }

            return count;
        }
    }

    public static void main(String args[]){
        SplitaStringinBalancedStrings outer = new SplitaStringinBalancedStrings();
        
        System.out.println(solution.balancedStringSplit("LRLRLLRR"));
    }
}

