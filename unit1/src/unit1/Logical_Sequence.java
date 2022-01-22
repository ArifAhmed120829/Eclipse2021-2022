package unit1;

import java.util.Scanner;

public class Logical_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		
		for(int i = 1; i<=x;i++) {
			int u =(int) Math.pow(i, 2);
			int q = i*u;
			int r = u+1;
			int e = q+1;
			System.out.println(i+" "+u+" "+q+" ");
			System.out.println(i+" "+r+" "+e+" ");
		}

	}

}
