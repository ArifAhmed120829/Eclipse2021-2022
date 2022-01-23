package unit1;

import java.util.Scanner;

public class Summing_Consecutive_Integers_1149 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();//3
		int N = in.nextInt();//2
		int sum = 0;
		int z = 0;
		//print the sum of N numbers from A	
		//A=3 , N=2; sum = 3+2+2
		if((N==0 || N<=0)) {
			int N2 = in.nextInt();
			System.out.println("Pls enter positive value");

			
			
		}
		for(int i = A; i>=N;i--) {
			sum = sum + i;
			z = sum + N;
			
		}
		System.out.println(z);

	}

}
