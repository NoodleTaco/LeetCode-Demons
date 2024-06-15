using System;

public class Solution {
    public int NumIdenticalPairs(int[] nums) {
        int numPairs = 0;
        Dictionary<int, int> count = new Dictionary<int, int>();
        foreach(int val in nums){
            if(count.ContainsKey(val)){
                numPairs += count[val];
                count[val]++;
            }
            else{
                count.Add(val, 1);
            }
        }

        return numPairs;
    }
}