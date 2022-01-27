package unit1;

import java.util.Scanner;

public class Perfect_Number_1164 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6 = 1,2,3 = 1+2+3 = 6
		//28 = 1,2,4,7,14 = 1+2+4+7+14 = 28//
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		for(int i = 1; i<=t; i++) {
			int  num = in.nextInt();//28
			int sum = 0;
			for(int j = 1; j<num; j++) {
				if(num%j==0) {//28/1,28/2
					sum = sum + j;//sum = 1+2+4
					
				}
			}
			
			if(sum==num) {
				System.out.println(num+" eh perfeito");
			}
			else {
				System.out.println(num+" nao eh perfeito");
			}
		}

	}

}
