import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int n = Integer.parseInt(bf.readLine());
    	
    	for (int i = 0; i < n; i++) {
    		int sum = 0;
			String readAb = bf.readLine();
			StringTokenizer st = new StringTokenizer(readAb," ");
			while(st.hasMoreTokens()) {
				String token = st.nextToken();
				sum += Integer.parseInt(token);
			}
			bw.write(sum + "\n");
			
		}
    	bw.flush();
    	bw.close();
    }
}
