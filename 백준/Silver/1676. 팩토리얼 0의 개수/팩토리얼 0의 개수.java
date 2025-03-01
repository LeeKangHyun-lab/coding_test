import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	 public static void main(String[] args) throws IOException{
		ArrayList<Character> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String m = br.readLine();
		int n = Integer.parseInt(m);
		BigInteger sum = BigInteger.ONE;
		for(int i = 1; i <= n; i++) {
			sum = sum.multiply(BigInteger.valueOf(i));
		}

		String str = String.valueOf(sum);
		for(int i = 0; i < str.length(); i++) {
			list.add(str.charAt(i));
		}

		Collections.reverse(list);
		int cnt = 0;
		
		for(char c : list) {
			if(c == '0') {
				cnt++;
			}
			else break;
		}
		System.out.println(cnt);
	}
}
