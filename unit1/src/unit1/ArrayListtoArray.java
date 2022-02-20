package unit1;

import java.util.ArrayList;

public class ArrayListtoArray {

	public static void main(String[] args) {
		//Convert an ArrayList to  an Arrray
		ArrayList<String> list = new ArrayList<String>();
		list.add("Python");
		list.add("Java");
		list.add("Php");
		list.add("Perl");
		list.add("C#");
		String[] my_array = new String[list.size()];
		list.toArray(my_array);
		for(String string:my_array) {
			System.out.println(string);
		}

	}

}
