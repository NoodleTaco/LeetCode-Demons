class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m-1;
        int ptr2 = n-1;

        int insertIndex = m + n -1;

        //nums2 has numbers to merge
        while(ptr2 >= 0){
            //ptr1 value is greater than nums2 value. It also has to be greater than 0 because if both's largest values are 0 at that point, nums 2 should be merged
            if(ptr1 >= 0 && nums1[ptr1] > nums2[ptr2]){
                nums1[insertIndex] = nums1[ptr1];
                ptr1 --;
            }
            else{
                nums1[insertIndex] = nums2[ptr2];
                ptr2 --;
            }

            insertIndex--;
        }
    }
}