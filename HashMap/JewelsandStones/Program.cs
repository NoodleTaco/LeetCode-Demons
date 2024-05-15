using System;
public class Solution {
    public int NumJewelsInStones(string jewels, string stones) {
        int count = 0;
        HashSet<char> jewelSet = new HashSet<char>(jewels);
        foreach(char c in stones){
            if(jewelSet.Contains(c)){
                count++;
            }
        }
        return count;
    }
}