import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<String[]> list = new ArrayList<>();
        
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            String[] arr = br.readLine().split(" ");
            list.add(arr);
        }

        list.sort(Comparator.<String[]>comparingInt(member -> Integer.parseInt(member[1])).thenComparingInt(member -> Integer.parseInt(member[0])));
    
        for(String[] x : list){
            bw.write(x[0] + " " + x[1] + "\n");
        }
        bw.flush();
        bw.close();

    }
}
