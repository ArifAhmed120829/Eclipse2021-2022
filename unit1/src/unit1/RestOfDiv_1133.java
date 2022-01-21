package unit1;

import java.util.Scanner;

public class RestOfDiv_1133 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Two Positive integers
		int x = in.nextInt();
		int y = in.nextInt();
		if(y>x) {
			for(int i = x+1; i<y;i++) {
				if(i%5==2||i%5==3) {
					System.out.println(i);
				}
			}
		}
		else if(x>y) {
			for(int i = y+1; i<x;i++) {
				if(i%5==2||i%5==3) {
					System.out.println(i);
				}
			}
		}
		else {
			System.out.println(0);
		}

	}

}
