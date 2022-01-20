package unit1;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		for(int i = 0;i<5;i++) {
			double x = Math.random();
			double y = in.nextDouble();
			if(x==y) {
				System.out.println("Congratulations You won");
				System.out.println("Quit The Game");
				break;
			}
			else if(x>y) {
				System.out.println("Pls input higher value");
			}
			else if(y>x) {
				System.out.println("Pls input lower value");
				
			}
			
		}
		System.out.println("Game Over");
		System.out.println("Quit The Game");
		
		

	}

}
