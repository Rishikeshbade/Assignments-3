package Assignments3;

public class ArmstronNumberFrom1To1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Armstrong Numbers from 1 to 1000: ");
		
		for(int i = 1; i <= 1000; i++) {
			int n = i;
			int sum = 0;
			int armstrong = n;
			
			while(armstrong > 0) {
				int cube = armstrong % 10;
				sum = sum + (cube * cube * cube);
				armstrong = armstrong / 10;
			}
			
			if(sum == n) {
				System.out.println(n+" is an Armstrong Number");
			}else {
				
			}
		}

	}

}
