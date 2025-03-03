
import java.util.*;

class Solution {
    public static int solution(int slice, int n) {
        int answer = 0;
        
        
        for(int i = 1; ; i++){
            if(slice * i >= n){
                answer = i;
                break;
            }
        }
        
        
        
        return answer;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("피자 조각수를 입력해주세요.");
        int slice = scan.nextInt();
       
        
        System.out.print("n을 입력해주세요.");
        int n = scan.nextInt();
        
        
        solution(slice, n);
    }
}