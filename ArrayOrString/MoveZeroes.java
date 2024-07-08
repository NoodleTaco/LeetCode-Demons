class Solution {
    public void moveZeroes(int[] nums) {
        int indexPtr = 0;

        for (int i = 0; i < nums.length; i ++){
            int curr = nums[i];
            if(curr != 0){
                nums[indexPtr] = curr;
                indexPtr++;
            }
        }

        while(indexPtr < nums.length){
            nums[indexPtr] = 0;
            indexPtr++;
        }
    }
}