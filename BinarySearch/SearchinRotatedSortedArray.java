class Solution {
    public int search(int[] nums, int target) {
        int lowPtr = 0;
        int highPtr = nums.length-1;

        while(lowPtr <= highPtr){
            int midPtr = (lowPtr + highPtr)/2;

            if(nums[midPtr] == target){
                return midPtr;
            }

            if(nums[midPtr] >= nums[lowPtr]){
                if(target >= nums[lowPtr] && target < nums[midPtr]){
                    highPtr = midPtr-1;
                }
                else{
                    lowPtr = midPtr+1;
                }
            }
            else{
                if(target <= nums[highPtr] && target > nums[midPtr]){
                    lowPtr = midPtr+1;
                }
                else{
                    highPtr = midPtr-1;
                }
            }

        }
        return -1;
    }
}