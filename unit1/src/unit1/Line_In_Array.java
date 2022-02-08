package unit1;

import java.util.Scanner;

public class Line_In_Array {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[][] M = new double[12][12];
		int L = in.nextInt();
		int r,c;
		double sum = 0.0;
		char[] T;
		T = new char[2];
		T = in.next().toCharArray();
		for( r = 0; r<12;r++) {
			for(c = 0; c<12;c++) {
					M[r][c] = in.nextDouble();
			}
		}
		for(c = 0; c<12; c++) {
			sum = sum + M[L][c];
			
		}
		if(T[0]=='S') {
			String str = String.format("%.1f", sum);
			System.out.println(str);
		}
		else if(T[0]=='M') {
			double res = sum/12;
			String str = String.format("%.1f", res);
			System.out.println(str);
		}
	}

}
