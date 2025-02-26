import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
    	Scanner scan = new Scanner(System.in);
    	ArrayList<Character> list = new ArrayList<>();
    	int n = scan.nextInt();
    	
    	int cnt = 0;
    	for (int i = 0; i < n; i++) {
    		boolean isGroup = true;
    		list = new ArrayList<>();
			String word = scan.next();
			for (int j = 0; j < word.length(); j++) {
				char find = word.charAt(j);
				if(j > 0 && word.charAt(j - 1) != find) {
					if(list.contains(find)) {
						isGroup = false;
						break;
					}
					
				}
				list.add(find);
			}

			if(isGroup) cnt ++; 
			
		}
    	System.out.println(cnt);
    }
}
