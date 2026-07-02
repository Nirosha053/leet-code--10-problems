class Solution {
    public int longestOnes(int[] nums, int k) {
        int i,j;
        int maxLength=0;
        for(i=0;i<nums.length;i++){
            int tempk=k;
            for(j=i;j<nums.length;j++){
                if(nums[j]==0){
                    if(tempk==0){
                  break;
                }
                    tempk--;
                }
                maxLength=Math.max( maxLength,j-i+1);
            }

        }
        return maxLength;
    }
}