class Solution {
    public int solution(int order) {
        int answer = 0;
        while(order > 0){
            int value = order % 10;
            order = order / 10;
            if(value == 3 || value == 6 || value == 9) answer++;
        }
        return answer;
    }
}