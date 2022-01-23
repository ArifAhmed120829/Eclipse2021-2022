package unit1;

import java.util.Scanner;

public class Growing_Sequences_1146 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int X;
		while ((X = in.nextInt()) != 0) {
			for (int i = 1; i <= X; i++) {
				if (i == X) {
					System.out.print(i+"\n");
				}else {
					System.out.print(i+" ");
				}
				
			}
			
		}
	
	}

}
