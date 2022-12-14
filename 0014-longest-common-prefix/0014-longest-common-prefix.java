class Solution {
    public String longestCommonPrefix(String[] strs) {

        String ans = "";
        int minLength = strs[0].length();
        int idx = 0;

        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            if (s.length() < minLength) {
                minLength = s.length();
                idx = i;
            }

        }

        for (int i = 0; i < minLength; i++) {
            String key = strs[idx].substring(0,i+1);
            int sum = 0;
            for (int j = 0; j < strs.length; j++) {
                if(strs[j].startsWith(key)) {
                    sum++;
                }
            }    
            if (sum == strs.length) {
                ans = key;
            } else {
                return ans;
            }
        }
        return ans;
    }
}