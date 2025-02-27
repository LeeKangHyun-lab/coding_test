import java.util.Scanner;

public class Main {

    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	int subjectCnt = scan.nextInt();
    	int max = Integer.MIN_VALUE;
    	double[] testArr = new double[subjectCnt];
    	double sum = 0;
    	double avg = 0;
    	
    	for (int i = 0; i < testArr.length; i++) {
			int subject = scan.nextInt();
			testArr[i] = subject;
			if(subject > max) max = subject;
			
		}
    	for (int i = 0; i < testArr.length; i++) {
    		 testArr[i] = (double)testArr[i] / max * 100.0;
		}
    	for (int i = 0; i < testArr.length; i++) {
			sum += testArr[i];
			avg = sum / testArr.length;
		}

    	System.out.println(avg);
    	
    	scan.close();
    	
    }
}