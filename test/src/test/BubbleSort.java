package test;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {1,5,2,8,6,4,9,3,0,-10,21};
	
		for (int i=numbers.length-1; i>0; i--) {
			
			for (int j=0; j<i;j++) {
				
                if (numbers[j] > numbers[j+1]) {
					
					numbers[j] = numbers[j] + numbers[j+1];
					numbers[j+1] = numbers[j] - numbers[j+1];
					numbers[j] = numbers[j] - numbers[j+1];
				}
			}
		}
		
		
		for (int number: numbers) {
		
			System.out.print(number + ", ");
		}
	}
}



/*
   1 5 2 8 6 4 9 3 0
1: [1 5] 2 8 6 4 9 3 0 Ë  1 5 2 8 6 4 9 3 0 
   1 [5 2] 8 6 4 9 3 0 Ë  1 2 5 8 6 4 9 3 0
   1 2 [5 8] 6 4 9 3 0 Ë  1 2 5 8 6 4 9 3 0
   1 2 5 [8 6] 4 9 3 0 Ë  1 2 5 6 8 4 9 3 0
   1 2 5 6 [8 4] 9 3 0 Ë  1 2 5 6 4 8 9 3 0
   1 2 5 6 4 [8 9] 3 0 Ë  1 2 5 6 4 8 9 3 0
   1 2 5 6 4 8 [9 3] 0 Ë  1 2 5 6 4 8 3 9 0
   1 2 5 6 4 8 3 [9 0] Ë  1 2 5 6 4 8 3 0 9
   
2: [1 2] 5 6 4 8 3 0 9 Ë  1 2 5 6 4 8 3 0 9
   1 [2 5] 6 4 8 3 0 9 Ë  1 2 5 6 4 8 3 0 9
   1 2 [5 6] 4 8 3 0 9 Ë  1 2 5 6 4 8 3 0 9
   1 2 5 [6 4] 8 3 0 9 Ë  1 2 5 4 6 8 3 0 9
   1 2 5 4 [6 8] 3 0 9 Ë  1 2 5 4 6 8 3 0 9
   1 2 5 4 6 [8 3] 0 9 Ë  1 2 5 4 6 3 8 0 9
   1 2 5 4 6 3 [8 0] 9 Ë  1 2 5 4 6 3 0 8 9

 
 
 
 
 */