using System;
public class Solution {
    public int MostWordsFound(string[] sentences) {
        int maxLength = 0;
        foreach(String currSentence in sentences){
            int currLength = currSentence.Split(" ").Length;
            if(currLength > maxLength){
                maxLength = currLength;
            }
        }
        return maxLength;
    }
}