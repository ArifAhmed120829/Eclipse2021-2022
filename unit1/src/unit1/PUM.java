package unit1;

import java.util.Scanner;

public class PUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();//7
		int i =0;
		for(int u = 0; u<x; u++){//0<7
			for(int j = 0; j < 3; j++) {
				i++;
				System.out.print(i+" ");
				
				
			}
			System.out.print("PUM");
			System.out.println();
			i++;
			
			
		}

	}

}
