package unit1;

import java.util.Scanner;

public class Array_Fill_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();//3
		int[] N = new int[1000];
		for(int i=0,j=0; i<N.length; i++) {
			
			System.out.println("N["+i+"] = "+j);
			j++;
			if(j==T)
				j=0;
			
		}
		
	}

}
