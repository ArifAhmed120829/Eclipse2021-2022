package unit1;

import java.util.Scanner;

public class MultiplesOf13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();//100--104,117,130,143,156,169,182,195
		int y = in.nextInt();//200//
		int res1 = 0;
		
		//between x & y all numbers shouldn't be divide by 13
		if(y>x) {
			for(int i = y; i>=x;i--) {
				if(i%13!=0) {
					res1 = res1 + i;
					
				}
			}
			
		}
		else if(x>y) {
			for(int i = x; i>=y;i--) {
				if(i%13!=0) {
					res1 = res1 + i;
					
				}
			}
			
		}
		
		System.out.println(res1);

	}

}
