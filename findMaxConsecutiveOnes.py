class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        maxOnes = 0
        ones = 0
        for i in nums:
            if(i == 1):
                ones+=1
            else:
                ones = 0
            maxOnes = max(maxOnes, ones)
            
        return maxOnes
        
