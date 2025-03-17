import java.util.*;

class Solution {
    public static int[] solution(int n) {
        int temp = 0;
        int odd = 0;
        int index = 0;
        for(int i = 0; i < n; i++){
            if((i+1) % 2 != 0){
                odd++;
            } 
        }
        
        int[] answer = new int[odd];
        
        for(int i = 0; i < n; i++){
            if((i+1) % 2 != 0){
                answer[index++] = i+1;
            }
        }   
        
        for(int i = 0; i < answer.length ; i++){
            for(int j = 0; j < answer.length; j++){
                if(answer[i] < answer[j]){
                    temp = answer[i];
                    answer[i] = answer[j];
                    answer[j] = temp;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner scan =  new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] array = solution(n);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            }
    }
    
}