package unit1;

import java.util.Scanner;

public class Matrix_Addition {

	public static void main(String[] args) {
		int rows,columns,loop1,loop2;
		Scanner in = new Scanner(System.in);
		
		rows = in.nextInt();
		columns = in.nextInt();
		
		int array1[][] = new int[rows][columns];
		int array2[][] = new int[rows][columns];
		int sum[][] = new int[rows][columns];
		
		System.out.println("Input elements for the first matrix");
		
		for(loop1 = 0; loop1<rows; loop1++)
			for(loop2 = 0; loop2<columns; loop2++)
				array1[loop1][loop2] = in.nextInt();
		System.out.println("Input the elements for the second matrix");
		for(loop1 = 0; loop1<rows; loop1++)
			for(loop2 = 0; loop2<columns; loop2++)
				array2[loop1][loop2] = in.nextInt();
		for(loop1 = 0; loop1<rows; loop1++)
			for(loop2 = 0; loop2<columns; loop2++)
				sum[loop1][loop2] = array1[loop1][loop2]+array2[loop1][loop2];
		System.out.println("Sum of the matrices:- ");
		 for ( loop1 = 0 ; loop1 < rows; loop1++ )
		    {
		       for ( loop2 = 0 ; loop2 < columns ; loop2++ )
		          System.out.print(sum[loop1][loop2]+"\t");

		       System.out.println();

	}
	}
}



