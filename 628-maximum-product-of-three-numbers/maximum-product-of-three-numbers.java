class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);  
        int end = nums.length -1;
        int count = 0;
        int sum=1;
        int nsum = 1;
        int start = 0;
        int result =1;
        
            sum = nums[end]*nums[end-1]*nums[end-2];
            nsum = nums[start]*nums[start+1]*nums[end] ;
           
            result = Math.max(sum,nsum);

        
        return result;
        
    }
}