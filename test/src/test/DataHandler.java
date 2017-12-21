package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DataHandler {

	public static void main(String[] args) {
		
		String [][] bags = new String[5][3];
		
		bags[0] = new String [] {"A", "3", "4"};
		bags[1] = new String [] {"B", "4", "5"};
		bags[2] = new String [] {"C", "5", "6"};
		bags[3] = new String [] {"D", "6", "7"};
		bags[4] = new String [] {"E", "9", "10"};
		
		List<List<String>> resultList = new ArrayList<List<String>>();
		
		for (int i=0; i<bags.length;i++) {
			
			List<String> sub1ResultList = new ArrayList<String>();			
			sub1ResultList.add(bags[i][0]);
			sub1ResultList.add(bags[i][1]);
			sub1ResultList.add(bags[i][2]);			
			resultList.add(sub1ResultList);
			
			for (int j=i+1; j<bags.length;j++) {
				
				List<String> sub2ResultList = new ArrayList<String>();
				sub2ResultList.add(bags[i][0] + bags[j][0]);
				sub2ResultList.add((Integer.parseInt(bags[i][1]) + Integer.parseInt(bags[j][1])) + "");
				sub2ResultList.add((Integer.parseInt(bags[i][2]) + Integer.parseInt(bags[j][2])) + "");	
				if (sub2ResultList.get(1).compareTo("15") <= 0) {
				
					resultList.add(sub2ResultList);				
				}
			
				for (int k=j+1; k<bags.length;k++) {
					
					List<String> sub3ResultList = new ArrayList<String>();
					sub3ResultList.add(bags[i][0] + bags[j][0] + bags[k][0]);
					sub3ResultList.add((Integer.parseInt(bags[i][1]) + Integer.parseInt(bags[j][1]) + Integer.parseInt(bags[k][1])) + "");
					sub3ResultList.add((Integer.parseInt(bags[i][2]) + Integer.parseInt(bags[j][2]) + Integer.parseInt(bags[k][2])) + "");			
					if (sub3ResultList.get(1).compareTo("15") <= 0) {
						
						resultList.add(sub3ResultList);				
					}		
					
					for (int h=k+1; h<bags.length;h++) {
						
						List<String> sub4ResultList = new ArrayList<String>();
						sub4ResultList.add(bags[i][0] + bags[j][0] + bags[k][0] +  bags[h][0]);
						sub4ResultList.add((Integer.parseInt(bags[i][1]) + Integer.parseInt(bags[j][1]) + Integer.parseInt(bags[k][1]) + Integer.parseInt(bags[h][1])) + "");
						sub4ResultList.add((Integer.parseInt(bags[i][2]) + Integer.parseInt(bags[j][2]) + Integer.parseInt(bags[k][2]) + Integer.parseInt(bags[h][2])) + "");			
						if (sub4ResultList.get(1).compareTo("15") <= 0) {
							
							resultList.add(sub4ResultList);				
						}
						
						for (int m=h+1; m<bags.length;m++) {
							
							List<String> sub5ResultList = new ArrayList<String>();
							sub5ResultList.add(bags[i][0] + bags[j][0] + bags[k][0] +  bags[h][0] + bags[m][0]);
							sub5ResultList.add((Integer.parseInt(bags[i][1]) + Integer.parseInt(bags[j][1]) + Integer.parseInt(bags[k][1]) + Integer.parseInt(bags[h][1]) + Integer.parseInt(bags[m][1])) + "");
							sub5ResultList.add((Integer.parseInt(bags[i][2]) + Integer.parseInt(bags[j][2]) + Integer.parseInt(bags[k][2]) + Integer.parseInt(bags[h][2]) + Integer.parseInt(bags[m][2])) + "");			
							if (sub5ResultList.get(1).compareTo("15") <= 0) {
								
								resultList.add(sub5ResultList);				
							}
						}
					}
					
				}
			}
		}
	
		for (int i=0; i<resultList.size(); i++) {
			
			System.out.print(resultList.get(i).get(0) + ", " + resultList.get(i).get(1) + ", " + resultList.get(i).get(2));
			System.out.println("");
		}
		
		Collections.sort(resultList, new Comparator<List<String>>(){

			@Override
			public int compare(List<String> o1, List<String> o2) {
				
				int int1 = Integer.parseInt(o1.get(2));
				int int2 = Integer.parseInt(o2.get(2));
				
				if (int1 < int2) {
					
					return 1;
				} else if (int1 == int2) {
					
					return 0;
				} else {
					
					return -1;
				}
			}
			
		});
		
		System.out.println("-----------------------------------------");
		
		for (int i=0; i<resultList.size(); i++) {
			
			System.out.print(resultList.get(i).get(0) + ", " + resultList.get(i).get(1) + ", " + resultList.get(i).get(2));
			System.out.println("");
		}
		
		
		System.out.println("-----------------------------------------");
		System.out.println(resultList.get(0));
	}

}
