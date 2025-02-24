import java.util.*;

class Solution {
    public static int solution(int age) {
        int answer = 0;
        answer = 2022 - age + 1;
        return answer;
    }
    
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int age = scan.nextInt();
    
    solution(age);
        
    }
}