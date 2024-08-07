import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int index = -1;

        List<Integer> ansList = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i ++){
            if(nums[i] < 0){
                index = (nums[i]* -1) -1 ;
            }
            else{
                index = nums[i] -1;
            }

            if(nums[index] > 0){
                nums[index] *= -1;
            }
        }

        for(int i = 0; i < nums.length; i ++){
            if (nums[i] > 0 ){
                ansList.add(i+1);
            }
        }
        return ansList;
    }
}