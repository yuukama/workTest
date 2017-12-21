package test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

	private static int NUM = 50;
	
	public static void main(String[] args) throws IOException, FileNotFoundException {
	
		int[] members = new int[NUM];
		
		for (int i=0; i<NUM; i++) {
			
			members[i] = i+1;
		}
		
		doCheck(members);
		
		for (int i=0; i<NUM; i++) {
			
            if (members[i] % 3 != 0) {
				
            	System.out.print(i + " : ");
    			System.out.println(members[i]);
			}
		}
	}
	
	public static void doCheck(int[] members) {
		
		for (int i=0; i<NUM; i++) {
			
			System.out.print(members[i] + ",");
		}
		
		System.out.println("\n----------------------------------");
		
		int count = 0;
		
		for (int i=0; i<NUM; i++) {
			
			if (members[i] > 0) {
				
				count++;
			}
		}
		
		if (count == 1) {
			
			return ;
		} else if (count == 2) {
			
			for (int i=0; i<NUM; i++) {
				
				if (members[i] != 0 && members[i] % 3 == 0) {
					
					return;
				}
			}
		}
		
		int j = max(members) + 1;
		for (int i=0; i<NUM; i++) {
			
			if (members[i]%3 == 0) {
				
				members[i] = 0;
			}
		}
				
		for (int i=0; i<NUM; i++) {

			if (members[i] != 0) {
				
				members[i] = j;				
				j++;
			}
		}
		
		doCheck(members);
	}
	
	private static int max(int[] members) {
		
		int max = members[0];
		for (int i=1; i<NUM; i++) {
			
			if (max < members[i]) {
				
				max = members[i];
			}
		}
		
		return max;
	}
}
