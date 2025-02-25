import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<int[]> point = new ArrayList<>();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++){
            String[] arr = br.readLine().split(" ");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);
            point.add(new int[]{x, y});
        }

        point.sort(Comparator.comparingInt((int[] p) -> p[0]).thenComparingInt((int[] p) -> p[1]));

        for(int[] value : point){
            bw.write(value[0] + " " + value[1] + "\n");
        }
        bw.flush();
        bw.close();
    }
}