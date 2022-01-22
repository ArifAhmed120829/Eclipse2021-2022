package unit1;

import java.util.Scanner;

public class SqCubic_1143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		
		if (x >= 1 && x <= 1000) {
			for(int i = 1; i<=x; i++) {
				
				int sq = (int) Math.pow(i, 2);
                int multi = i * sq;
                System.out.println(i + " " + sq + " " + multi);
				
			
		}
		}
		

	}

}
