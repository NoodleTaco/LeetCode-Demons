class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr1 = 0;
        int ptr2 = 0;
        int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[ptr1] != nums[ptr2]){
                ptr2 = ptr1;
                count ++;
            }

            ptr1++;

        }
        return count;
    }
}