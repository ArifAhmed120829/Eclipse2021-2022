package unit1;

import java.util.Arrays;

public class Duplicate_Array2 {
	static void unique(int[] arr1) {
		System.out.println("Original Array: ");
		
			System.out.println(Arrays.toString(arr1));
		
		int no_unique = arr1.length;
		for(int i = 0; i<no_unique; i++) {
			for(int j = i+1; j<no_unique;j++) {
				if(arr1[i]==arr1[j]) {
					arr1[j]= arr1[no_unique-1];
					no_unique--;
					j--;
				}
			}
		}
		int[] arr2  = Arrays.copyOf(arr1, no_unique);
		System.out.println();
		System.out.println("Arrays with unique values: ");
		System.out.println(Arrays.toString(arr2));
		System.out.println();
		System.out.println("-----------");
	}

	public static void main(String[] args) {
		unique(new int[] {0,3,-2,4,3,2});
		unique(new int[] {10,22,10,20,11,22});
		

	}

}
