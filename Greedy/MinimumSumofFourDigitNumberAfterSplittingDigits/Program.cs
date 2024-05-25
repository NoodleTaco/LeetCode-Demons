using System;

public class Solution {
    public int MinimumSum(int num) {
        int[] digitArr = new int[4];
        int curr = 0;
        while(num > 0){
            digitArr[curr] = num % 10;
            curr++;
            num /= 10;
        }

        Array.Sort(digitArr);

        int firstNum = digitArr[0] * 10 + digitArr
    }
}