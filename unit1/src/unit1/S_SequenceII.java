package unit1;

public class S_SequenceII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39
		//2,4,8,16,32,64
		double x;
		double sum = 0;
		double j = 2;
		for(double i = 3; i<=39; i= i +2) {
			x = i/j;
			sum = sum + x;
			j = j*2;	
		}
		double res = sum + 1;
		String str = String.format("%.2f",res);
		System.out.println(str);
		

	}

}
