class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0, ones = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 1)
            {
                ones++;
            }
            else
            {
                ones = 0;
            }
            maxOnes = Math.max(maxOnes, ones);
        }
        
        return maxOnes;
        
    }
}
