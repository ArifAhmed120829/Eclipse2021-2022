package unit1;

import java.util.Scanner;

public class Prime_Number_1165 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		
		for(int i = 1; i<= test_case; i++) {
			int n = in.nextInt();//7
			boolean prime = true;
			int j = 2;
			while(j<=n/2) {//2<=3,3<=3
				if(n%j==0) {//7/2==1,7/3==1
					prime = false;
				}
				
				j++;
			}
			if(prime==false) {
				System.out.println(n+" nao eh primo");
			}
			else {
				System.out.println(n+" eh primo");
			}
			
			
	

}
	}
}
