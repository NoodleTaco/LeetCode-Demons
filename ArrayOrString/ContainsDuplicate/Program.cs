using System;
public class Solution {
    public bool ContainsDuplicate(int[] nums) {
        HashSet<int> visitedNums = new HashSet<int>();
        foreach(int val in nums){
            if(visitedNums.Contains(val)){
                return true;
            }
            else{
                visitedNums.Add(val);
            }
        }
        return false;
    }
}