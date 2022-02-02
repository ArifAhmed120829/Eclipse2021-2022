package unit1;



import java.util.Scanner;

public class Array_Fill_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Read a number X
		
		double X = in.nextDouble();
		
		//Put this X at the first position of an array N [100].
		double[] N = new double[100];
		
		//In each subsequent position (1 up to 99) put half of the number inserted at the previous position,
		for( int i = 0; i<N.length; i++) {
			N[i] = X;
			String str = String.format("%.4f", N[i]);
			System.out.println("N["+i+"] = "+str);
			X = (double)X/(double)2;
			
			
		}
		//Print all the vector N. 
		//System.out.println(Arrays.toString(N));
	}

}
