class Solution {
    public int mySqrt(int x) {
        int lowPtr = 1;
        int highPtr = x;
        int tempAns = 0;

        while (lowPtr <= highPtr){
            int mid = lowPtr + (highPtr - lowPtr)/2;
            if(x / mid == mid ){
                return mid;
            }
            else if (x / mid < mid){
                highPtr = mid -1;
            }
            else {
                lowPtr = mid +1;
                tempAns = mid;
            }
        }
        return tempAns;
    }
}