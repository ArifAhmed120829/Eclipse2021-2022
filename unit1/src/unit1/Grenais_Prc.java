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
			
			
			int x = in.nextInt();//3,2,3
			int y = in.nextInt();//2,3,1
			System.out.println("Novo grenal (1-sim 2-nao)");
			int ans = in.nextInt();//1,1,2
			i4++;
			if(ans==1) {
				if(x>y) {
					i1++;//1+1
				}
				else if(y>x) {
					i2++;//1
				}
				else {
					i3++;//
				}
				
			}
			else if(ans==2) {
				if(x>y) {
					i1++;//1+1
				}
				else if(y>x) {
					i2++;//1+
				}
				else {
					i3++;//
				}
				break;
			}
	
		}
		
	
		System.out.println(+i4+" "+"grenais");
		System.out.println("Inter:"+i1);
		System.out.println("Gremio:"+i2);
		System.out.println("Empates:"+i3);
		if(i1>i2) {
			System.out.println("Inter venceu mais");
		}
		else if(i2>i1) {
			System.out.println("Gremio venceu mais");
			
		}
		else if(i2==i1) {
			System.out.println("Não houve vencedor");
			
		}
		
		
		

	}

}
