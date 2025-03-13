import java.util.Scanner;

class Solution {
    public static int solution(String message) {
        int answer = 0;
        
        answer = message.length() * 2;
        
        
        return answer;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        
        System.out.print(solution(message));
    }
}