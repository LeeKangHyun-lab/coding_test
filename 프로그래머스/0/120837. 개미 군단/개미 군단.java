class Solution {
    public int solution(int hp) {
        int answer = 0;
        for(int i = 5; i >= 1; i -= 2){
           while(hp >= i){
               hp = hp - i;
               answer++;
            }
        }
        return answer;
    }
}