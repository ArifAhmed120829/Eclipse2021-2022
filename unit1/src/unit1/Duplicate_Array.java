package unit1;

public class Duplicate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {9,7,6,4,3,9,7,3};
		for(int i = 0; i<x.length-1;i++) {
			for(int j = i+1; j<x.length;j++) {
				if(x[i]==x[j] && i!=j) {
					System.out.println("Duplicate value: "+x[j]);
				}
			}
		}
		String[] abc = {"Abu","Sajal","Faysal","Arif","Sajal","Faysal"};
		for(int i =0; i<abc.length-1;i++) {
			for(int j = i+1; j<abc.length;j++) {
				if(abc[i]==abc[j] && i!=j) {
					System.out.println("Duplicate String value: "+abc[j]);
				}
			}
		}

	}

}
