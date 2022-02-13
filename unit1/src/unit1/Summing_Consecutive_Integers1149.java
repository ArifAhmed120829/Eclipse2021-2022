package unit1;

import java.util.Scanner;

public class Summing_Consecutive_Integers1149 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();//3
		int N = in.nextInt();//2
		int sum = 0;
		// While N is negative or ZERO, a new N (only N) must be read.
		//All input values are in the same line
		while(N<=0) N = in.nextInt(); 
		for(int i = 1; i<=N; i++) {
			sum = sum + A;
			A++;
		}
		System.out.println(sum);
	}

}