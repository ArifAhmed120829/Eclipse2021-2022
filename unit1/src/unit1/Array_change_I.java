package unit1;

import java.util.Scanner;

public class Array_change_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Write a program that reads an array N [20].
		int N[];
		int temp;
		N = new int[5];
		
		for( int i = 0; i<N.length;i++) {//0,1,2,3,4
			N[i] = in.nextInt();//0,-5,10,63,230
			
		}
		for(int i = 0; i<(N.length/2);i++) {//2
			temp = N[i];//-5
			N[i] = N[N.length-1-i];//63
			N[N.length-1-i] = temp;//-5
			//Ans: 230,63,10,-5,0
			
		}
		for(int i =0; i<N.length; i++) {//5
			System.out.println("N["+i+"] = "+N[i]);//Done
		}
		
		
		
	
		
		

	}
	}


