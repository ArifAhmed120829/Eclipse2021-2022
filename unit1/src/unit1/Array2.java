package unit1;

import java.util.ArrayList;

public class Array2 {

	public static void main(String[] args) {
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Fortnite");
		list2.add("Apex");
		list2.add("CS:GO");
		list2.add("COD WARZONE");
		System.out.println(list2);
		String[] my_array2 = new String[list2.size()];
		list2.toArray(my_array2);
		for(String str:my_array2) {
			System.out.println(str);
		}

	}

}
