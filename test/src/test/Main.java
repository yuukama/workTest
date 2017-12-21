package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		
/*		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String line = in.readLine();
		String[] params1 = line.split(" ");
		
		line = in.readLine();
		String[] params2 = line.split(" ");

		doTransfer(params1[0], params1[1], params1[2], params2);	
*/		
	
		
		String a = "101";
		int aa = Integer.parseInt(a, 2);
		
		String b = "100";
		int bb = Integer.parseInt(b, 2);
		
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(aa&bb);
	}
	
	public static void doTransfer(String N, String T, String C, String[] values) {
		
		int n = Integer.parseInt(N);
		int t = Integer.parseInt(T);
		int c = Integer.parseInt(C);
		
		int sum = 0;
		
		int valuesSum = 0;
		for (int i=0; i<c; i++) {
			
			valuesSum += Integer.parseInt(values[i]);
		}
		
		if (valuesSum <= t) {
			
			sum ++;
		}
		
		for (int i=1; i<=n-c; i++) {
						
			valuesSum -= Integer.parseInt(values[i-1]);
			valuesSum += Integer.parseInt(values[i+c-1]);
			
            if (valuesSum <= t) {
				
				sum ++;
			}
		}
		
		System.out.println(sum);
	}

}
