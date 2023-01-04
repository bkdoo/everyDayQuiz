class Solution {
    public List<String> cellsInRange(String s) {
        int ls = s.codePointAt(0);
        int rs = Integer.parseInt(s.substring(1,2));
        int le = s.codePointAt(3);
        int re = Integer.parseInt(s.substring(4,5));
        List<String> list = new ArrayList<>();

        for (int i = ls; i <= le; i++) {
            for (int j = rs; j <= re ; j++) {
                list.add(String.valueOf((char)i)+j);
            }
        }

        return list;
    }
}