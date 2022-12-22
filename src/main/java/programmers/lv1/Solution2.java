package programmers.lv1;

public class Solution2 {
    public int solution(String[] babbling) {
        int answer = 0;

        for (String s : babbling) {
            String s1 = s.replace("aya", "1").replace("ye", "2").replace("woo", "3").replace("ma", "4");
            if (s1.contains("11") || s1.contains("22") || s1.contains("33") || s1.contains("44")) {
                continue;
            }
            s1 = s1.replace("1", "").replace("2", "").replace("3", "").replace("4", "");
            if (s1.length() == 0) {
                answer++;
            }
        }

        return answer;
    }
}
