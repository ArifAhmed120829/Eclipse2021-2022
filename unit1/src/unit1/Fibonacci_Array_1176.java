package unit1;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci_Array_1176 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int j = 1; j<=T; j++) {
			int N = in.nextInt();//0
			if(N==0) {
				System.out.println("Fib(0) = "+0);
			}
			else {
				int z = N + 1;//1
				int[] arr = new int[z];
				arr[0] = 0;
				arr[1] = 1;
				
				
				for(int i = 2; i < arr.length; i++) {
					
					arr[i] = arr[i-1] + arr[i-2];
					
					
				}
				
				int g = z-1;
				System.out.println("Fib("+g+") = "+arr[z-1]);
				
			
				
			}
			
		}
	
	

	}

}
