import java.util.*;
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        int i=0;
        int j=(numbers.length)-1;
        while(j>i){
            if(numbers[i]+numbers[j]==target){
                result[0]=i+1;
                result[1]=j+1;
                return result;
            }
            else if(numbers[i]+numbers[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return result;
    }
}
