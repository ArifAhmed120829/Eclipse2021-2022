package unit1;

import java.util.Arrays;

public class Array_Practice {
	public static boolean simillar(int[]arr, int item) {
		for(int n:arr) {
			if(item==n) {
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int [][]a = new int[10][10];
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				System.out.printf("%2d ", a[i][j]);
			}
			System.out.println();
		}
		
		int[] numbers = {10,20,30,40,-25,100};
		int sum = 0;
		for(int i = 0; i< numbers.length; i++) {
			sum = sum + numbers[i];
			
		}
		double avg = sum/numbers.length;
		System.out.println(avg);
		*/
		int[]arr2 = {112,254,366,412,55,995,201,103,104,100};
		System.out.println(simillar(arr2,201));
		System.out.println(simillar(arr2,103));
	}

}
