package unit1;

import java.util.Scanner;

public class Array_Fill_IV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 15;
		int[] par;
		int[] impar;
		int[] par2;
		int[] impar2;
		int a = 0;
		int b = 0;
		int a1 = 0;
		int b1 = 0;
		int l = 0;
		int l2 = 0;
		par = new int[5];
		impar = new int[5];
		par2 = new int[5];
		impar2 = new int[5];
		Scanner in = new Scanner(System.in);
		for(int i = 0; i<x; i++) {
			int y = in.nextInt();
			if(y%2==0) {
				if(a!=5) {
					par[a] = y;
					a++;
				}
				else if(a==5) {
					par2[a1] = y;
					l = l+a1;
					a1++;
				}
				
			}
			else {
				if(b!=5) {
					impar[b] = y;
					b++;
					
				}
				else if(b==5){
					impar2[b1] = y;
					l2 = l2+b1;
					b1++;
				}
			}
		}
	
		for(a = 0; a<5;a++) {
			System.out.println("par["+a+"] = "+par[a]);
				
			}
		for(b = 0; b<5;b++) {
			System.out.println("impar["+b+"] = "+impar[b]);
			}
		for(b1 = 0; b1<l2+1;b1++) {
			System.out.println("impar["+b1+"] = "+impar2[b1]);
			}
		for(a1 = 0; a1<l;a1++) {
			System.out.println("par["+a1+"] = "+par2[a1]);
			}

	}

}
