package unit1;

import java.util.Scanner;

public class Solved_1176 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T,i,j;
		long[] N;
		N = new long[61];
		N[0]=0;
		N[1]=1;
		
		for(i=2; i<=60;i++) {
			N[i] = N[i-1] + N[i-2];
		}
		T = in.nextInt();
		for(i = 0; i<T; i++) {
			j=in.nextInt();
			System.out.println("Fib("+j+") = "+N[j]);
			
		}

	}

}
