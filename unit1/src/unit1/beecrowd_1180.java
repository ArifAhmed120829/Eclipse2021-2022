package unit1;


import java.util.Scanner;

public class beecrowd_1180 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] x = new int[n];
		int p=0;
		int i;
		int min;
		for( i = 0; i<x.length; i++) 
			x[i] = in.nextInt();
			min = x[0];
			for(i=1; i<x.length;i++) {
				if(min>x[i]) {
					min = x[i];
					p = i;
				}
			}
		
		/*
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		System.out.println(x[0]);
		*/
		System.out.println("Menor valor: "+min);
		System.out.println("Posicao: "+p);
		
		

	}

}
