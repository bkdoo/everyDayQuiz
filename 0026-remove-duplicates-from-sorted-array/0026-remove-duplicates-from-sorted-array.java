class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int temp = 500;
        
        for(int i=0;i< nums.length;i++){
            if(nums[i] != temp){
                temp = nums[i];
                nums[ans] = nums[i];
                ans++;
            }
        }

        return ans;
    }
}