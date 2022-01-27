package unit1;

import java.util.Scanner;

public class Array_fill_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int arr[];//declaring array
		arr = new int[10];//allocating memory into the array
		int V = in.nextInt();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = V;
			V = V*2;
			System.out.println("N["+i+"] = "+arr[i]);
		}

	}

}
