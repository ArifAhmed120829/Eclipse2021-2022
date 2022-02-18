package unit1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = new String[] {"adon","oni","sakib","sahakhari","habib","kamrul"};
		ArrayList <String> list1  = new ArrayList <String> (Arrays.asList(arr));
		System.out.println(list1);
		String arr2[] = new String[] {"Prapty","Orin","Abir","Sifat","Goku"};
		ArrayList<String> list2 = new ArrayList<String> (Arrays.asList(arr2));
		System.out.println(list2);
		Integer arr3[] = new Integer[] {10,20,3,0,4,52,5,63,5};
		ArrayList<Integer> list3 = new ArrayList<Integer> (Arrays.asList(arr3));
		System.out.println(list3);
		//Creating a List of type Book using ArrayList  
		list1.add("lola");
		list2.add("boka");
		list3.add(19);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		

	}

}
