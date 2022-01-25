package unit1;

import java.util.Scanner;

public class Ages_1154 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int i =0;
		for(;;) {
			int x = in.nextInt();
			if(x<0) {
				break;
			}
			else {
				sum = sum + x;
				i++;
				
			}
		}
		
		float d =  (float) sum/(float) i;
		String str = String.format("%.2f", d);
		System.out.println(str);
	
	
		

	}

}
