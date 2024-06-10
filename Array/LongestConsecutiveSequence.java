import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        
        Arrays.sort(nums);

        int maxSeq = -1;

        int currSeq = 1;

        
        for(int i = 0; i < nums.length -1; i ++){
            if(nums[i+1] == nums[i] + 1){
                currSeq ++;
            }
            else if (nums[i+1] != nums[i]){
                if(currSeq > maxSeq){
                    maxSeq = currSeq;
                }
                currSeq =1;
            }
        }
        if(currSeq > maxSeq){
            maxSeq = currSeq;
        }
        return maxSeq;
    }
}