package unit1;

import java.util.Scanner;

public class Type_Of_Fuel_1134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = 0;
		int g = 0;
		int d = 0;
		for(;;) {
			int x = in.nextInt();
			//range = 1 to 4
			if(x>0 && x<5) {
				if(x==1) {
					a++;
					
				}
				else if(x==2) {
					g++;
				}
				else if(x==3) {
					d++;
				}
				else if(x==4) {
					break;
				}
				
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+a);
		System.out.println("Gasolina: "+g);
		System.out.println("Diesel: "+d);

	}

}
