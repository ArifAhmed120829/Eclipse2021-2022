package unit1;

import java.util.Scanner;

public class Population_Increase_1160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// how many years would be necessary to the smaller city (always A) to be greater than the larger city (always B) in population.
		//the growing rate for city A is bigger than the growing rate for city B
		//print the time in years for each test case.
		//The first line of the input contains a single integer T,
		int T = in.nextInt();
		int sum;
		for(int i = 1; i<=T; i++) {
			sum = 0;
			int PA = in.nextInt();//100
			int PB = in.nextInt();//150
			double G1 = in.nextDouble();//population growing in percentage//1.0
			double G2 = in.nextDouble();//0
			while(PA<=PB) {
				PA  = (int) ((PA*(G1/100))+PA);
				
				PB   = (int) ((PB*(G2/100))+PB);//
				sum++;
				if(sum>100) {
					break;
				}
			}
			

		
		if(sum>100) {
			System.out.println("Mais de 1 seculo.");
		}
		else {
			System.out.println(sum+" anos.");
		}
		

	}
	}
}


