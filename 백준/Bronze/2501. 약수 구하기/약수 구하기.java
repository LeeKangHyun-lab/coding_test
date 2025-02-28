import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args){
	    	Scanner scan = new Scanner(System.in);
	    	ArrayList<Integer> list = new ArrayList<>();
	    	int num1 = scan.nextInt();
	    	int num2 = scan.nextInt();

	    	for (int i = 1; i <= num1; i++) {
				if(num1 % i == 0) list.add(i);
				}
	    	if(list.size() >= num2) {
	    		System.out.println(list.get(num2 - 1));
	    	}
	    	else {
	    		System.out.println(0);
	    	}
    }
}
