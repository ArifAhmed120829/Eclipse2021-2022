package unit1;

import java.util.Scanner;

public class Simple_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int res = 0;
		int x = in.nextInt();
		int y=0;
		int z = x*(x-1);//20*3*2*1
		for(int i = 2; i<x;i++) {//2,3,4
			y = z*(x-i);//60
			z=y;
			
		}
		
	
		System.out.println(z);
		
	
		
		
		
		

	}

}
