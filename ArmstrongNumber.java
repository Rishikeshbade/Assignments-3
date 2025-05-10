package Assignments3;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 153;
		int sum = 0;
		int armStrong = n;
		
		while(armStrong > 0) {
			int cube = armStrong % 10;
			sum = sum + (cube * cube * cube);
			armStrong = armStrong / 10;
		}
		
		if(sum == n) {
			System.out.println(n+" is an Armstrong Number");
		}else {
			System.out.println(n+" is not an Armstrong Number");
		}

	}

}
