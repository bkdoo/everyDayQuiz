class Solution {
    public boolean isPalindrome(int x) {

        int temp1 = x;
        int temp2 = 0;
        
        while (temp1>0) {
           int mod = temp1%10;
            temp2 = temp2*10 + mod;
            temp1 /= 10;
        }
        
        if (x==temp2) {
            return true;
        } else {
            return false;
        }
    }
}