package unit1;

import java.util.Scanner;

public class DivisorsI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N= in.nextInt();
		for(int i = 1; i<=N;i++) {
			if(N%i==0) {
				System.out.println(i);
			}
		}

	}

}
