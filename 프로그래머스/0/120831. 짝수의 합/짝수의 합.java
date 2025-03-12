import java.util.Scanner;

class Solution {
    public static int solution(int n) {
        int answer = 0;
        
        for(int i = 0;i <= n; i++){
        if(i <= n && i % 2 == 0)
            answer= answer + i;
            
        }
            
        
        return answer;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        solution(n);
    }
}
