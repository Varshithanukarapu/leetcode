class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxSum=Integer.MIN_VALUE;
        int i=0;int j=0;
        int Sum = 0;
        while(j<nums.length){
            Sum += nums[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                maxSum=Math.max(Sum,maxSum);
                Sum -=nums[i];
                i++;
                j++;
            }
        }
        return maxSum/k;
        
        
    }
}