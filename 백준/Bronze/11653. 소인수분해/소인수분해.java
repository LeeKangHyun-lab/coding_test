import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args){
	    	Scanner scan = new Scanner(System.in);
	    	ArrayList<Integer> list = new ArrayList<>();
	    	int n = scan.nextInt();
	    	if(n == 0) {
	    		System.out.println(0);
	    	}
	    	else if(n == 1) {}
	    	else {
	    		for (int i = 2; i <= n; i++) {
	    			if(n % i == 0) {
	    				list.add(i);
	    			}
				}
	    		for(int div : list) {
	    			while(n % div == 0) {
	    				n = n / div;
	    				System.out.println(div);
	    			}
	    		}
	    	}
	    	
	    	scan.close();
    }
}
