package unit1;

public class S_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(int i = 1; i <=100; i++) {
			 sum = sum + (double)1/i;
			
		}
		double res = sum;
		String str = String.format("%.2f", res);
		System.out.println(str);
		

	}

}
