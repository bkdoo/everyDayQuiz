class Solution {
    public int minPartitions(String n) {
        int[] nums = new int[n.length()];
        for (int i = 0; i < n.length(); i++) {
            nums[i] = Integer.parseInt(n.substring(i,i+1));
        }
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
}