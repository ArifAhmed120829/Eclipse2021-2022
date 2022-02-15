package unit1;

import java.util.Arrays;

public class Second_large {

	public static void main(String[] args) {
		// Find the second largest element in an array
		int[] array = {10789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2456};
		System.out.println("Array: "+Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Array: "+Arrays.toString(array));
		int z = array[array.length-2];
		System.out.println(z);

	}

}
