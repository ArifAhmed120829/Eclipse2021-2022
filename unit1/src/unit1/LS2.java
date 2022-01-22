package unit1;

import java.util.Scanner;

public class LS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();
		int Y = in.nextInt();
		int k = 0;
		for(int i = 1; i <= Y;i++) {
			for(int z = 1; z<=X;z++) {
				if(k<Y) {
					k++;
					System.out.print(k+" ");
					
				}
				
			}
			System.out.print("\n");
		}

	}

}
