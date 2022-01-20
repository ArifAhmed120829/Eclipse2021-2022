package unit1;

import java.util.Scanner;

public class Grenais_Prc {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i1 = 0;
		int i2 = 0;
		int i3 = 0;
		int i4 = 0;
		for(;;) {
			int x = in.nextInt();
			int y = in.nextInt();
			System.out.println("novo grenal");
			int o = in.nextInt();
			
			if(o==1) {
				int s = in.nextInt();
				int k = in.nextInt();
				if(s>k) {
					i1++;		
				}
				else if(k>s) {
					i2++;
					
				}
				else {
					i3++;
				}	
			}
			else if(o==2) {
				break;
			}
			i4++;
			
		}
		System.out.println("Grenais: "+i4);
		System.out.println("Inter: "+i1);
		System.out.println("Gremio: "+i2);
		System.out.println("Draw: "+i3);
		if(i1>i2) {
			System.out.println("Inter wins");
		}
		else if(i2>i1) {
			System.out.println("Gremio wins");
			
		}
		else if(i2==i1) {
			System.out.println("draw");
			
		}
		
		
		

	}

}
