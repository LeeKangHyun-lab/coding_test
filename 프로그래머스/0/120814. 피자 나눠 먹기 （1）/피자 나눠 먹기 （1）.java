class Solution {
    public int solution(int n) {
        int answer = 0;
        while(true){
            answer++;
            if(answer * 7 >= n){
                break;
            }
        }
        return answer;
    }
}