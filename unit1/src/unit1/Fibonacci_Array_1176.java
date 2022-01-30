package unit1;

import java.util.Scanner;

public class Fibonacci_Array_1176 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int limit = in.nextInt();//0
		if(limit==0) {
			System.out.println(0);
		}
		
		
		else {
			long[] series = new long[limit];
			series[0] = 0;
			series[1] = 1;
			
			for(int i = 2; i <limit; i++) {
				series[i] = series[i-1] + series[i-2];
			}
			
			System.out.println("Fibo up to "+limit);
			for(int i = 0; i<1; i++) {
				System.out.println(series[i]+" ");
			}
		}
	

	}

}
