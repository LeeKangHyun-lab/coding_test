import java.io.*;
import java.util.*;

public class Main {
	 public static void main(String[] args) throws IOException{
		ArrayList<String[]> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 int n = Integer.parseInt(br.readLine());
		 String[] arr = new String[2];
		 
		 for (int i = 0; i < n; i++) {
			arr = br.readLine().split(" ");
			list.add(arr);
		}
		
		
		
		 Collections.sort(list, Comparator.comparingInt(member -> Integer.parseInt(member[0])));
		
		for(String[] s : list) {
			bw.write(s[0] + " " + s[1] + "\n");
		}
		
		 
		 
		 bw.flush();
		 bw.close();
		 br.close();
	}
}
