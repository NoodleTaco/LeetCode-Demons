import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> valsMap = new HashMap<>();
        int numsLength = nums.length;

        for (int i = 0; i < numsLength; i++)
        {
            int complete = target - nums[i];

            if (valsMap.containsKey(complete))
            {
                return new int[] {i , valsMap.get(complete)};
            }
            else 
            {
                valsMap.put(nums[i], i);
            }

        }
        return new int[] {};
        

    }
}