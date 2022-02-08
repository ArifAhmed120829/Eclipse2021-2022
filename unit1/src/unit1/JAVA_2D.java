package unit1;

public class JAVA_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] arr = new String[3][3];
		arr[0][0] ="love";
		arr[0][1] ="sad";
		arr[0][2] ="happy";
		arr[1][0] ="photograph";
		arr[1][1] ="smile";
		arr[1][2] ="amazing";
		arr[2][0] ="beautiful";
		arr[2][1] ="wonderful";
		arr[2][2] ="honoured";
		System.out.println("First Array: ");
		for(int i = 0; i < arr.length; i++) {//9
			for(int j = 0; j<arr[i].length;j++) {
				System.out.println(arr[i][j]);
			}
			
		}
		String[][] arr2 = {{"Photograph","Unforgettable","Umbrella"},
				{"Shape of you","Dancing","Once i was 7 years old"},
				{"good for you","Baby","Lazy"}};
		System.out.println();
		
	
		System.out.println("Second Array: ");
		for(int i = 0; i < arr.length; i++) {//9
			for(int j = 0; j<arr[i].length;j++) {
				System.out.println(arr2[i][j]);
			}
			
		}

	}

}
