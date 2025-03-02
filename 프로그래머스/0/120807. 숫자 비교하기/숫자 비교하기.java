import java.util.*;

class Solution {
    public static int solution(int num1, int num2) {
        int answer = -1;
        if(num1 == num2)
            answer = 1;
        else 
            answer =-1;
        
        return answer;
    }
    
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    solution(num1,num2);
        
    }
}