package unit1;

import java.util.Scanner;

public class copy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner leitor = new Scanner(System.in);
	        int T = leitor.nextInt();//2
	        int PA, PB, anos;
	        double G1, G2;
	        for (int i = 1; i <= T; i++) {
	        	anos = 0;
	        	PA = leitor.nextInt();//90000
	        	PB = leitor.nextInt();//120000
	        	G1 = leitor.nextDouble();//5.5
	        	G2 = leitor.nextDouble();//3.5
	        	while (PB >= PA) {//120000>=90000
	        		PA += (PA * G1) / 100;//94950
	        		PB += (PB * G2) / 100;//124200
	        		anos++;
	        		if (anos > 100) {
	        			break;
	        		}
	        	}
	        	if (anos > 100) {
	        		System.out.println("Mais de 1 seculo.");
	        	} else {
	        		System.out.println(anos + " anos");
	        	}
	        }

	}

}
