package unit1;

import java.util.Arrays;

public class Array_prc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,9,2,3,5,6,4,1,0};
		System.out.println("Original Array: "+Arrays.toString(arr));
		for(int i = 0; i <arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		System.out.println("Reversed Array: "+Arrays.toString(arr));

	}

}
