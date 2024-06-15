using System;
public class Solution {
    public string FirstPalindrome(string[] words) {
        foreach(String currWord in words){
            int j = 0;
            int k = currWord.Length -1;
            bool isPal = true;
            while (k > j && isPal){
                if(currWord[j] != currWord[k]){
                    isPal = false;
                }
                j ++;
                k --;
            }
            if(isPal){
                return currWord;
            }
        }
        //Case where none is found
        return "";
    }

    static void Main(){
        string[] words = new string[] {"hi", "tacocat"};
        Solution solution = new Solution();
        Console.WriteLine(solution.FirstPalindrome(words));
    }
}