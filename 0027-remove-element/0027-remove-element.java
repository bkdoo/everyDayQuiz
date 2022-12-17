class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==val) {
                nums[i] = 400;
                k++;
            }
        }
        
        Arrays.sort(nums);

        return nums.length-k;
    }
}