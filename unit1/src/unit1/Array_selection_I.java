package unit1;

import java.util.Scanner;

public class Array_selection_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// your task is to read an array A[100].
		double A[];
		A = new double[100];
		// At the end, print all array positions 
		//that store a number less or equal to 10 
		//and the number stored in that position.
		for(int i = 0; i<A.length;i++) {
			A[i] = in.nextDouble();
			if(A[i]<=10) {
				System.out.println("A["+i+"] = "+A[i]);
			}
		}

	}

}
