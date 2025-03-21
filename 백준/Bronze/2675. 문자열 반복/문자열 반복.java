import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	int amount = scan.nextInt();
    	
    	for (int i = 0; i < amount; i++) {
			int loopCnt = scan.nextInt();
			String word = scan.next();
			for (int j = 0; j < word.length(); j++) {
				char character = word.charAt(j);
				for (int k = 0; k < loopCnt; k++) {
					System.out.print(character);
				}
			}
			System.out.println();
		}
    }   	
}