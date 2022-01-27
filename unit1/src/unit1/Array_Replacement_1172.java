package unit1;

import java.util.Scanner;

public class Array_Replacement_1172 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10 int numbers
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		for(int i = 0; i<arr.length;i++) {
			arr[i]=in.nextInt();
			if(arr[i]<=0) {
				arr[i] = 1;
			}
			System.out.println("X["+i+"]"+" = "+arr[i]);
		}

	}

}
