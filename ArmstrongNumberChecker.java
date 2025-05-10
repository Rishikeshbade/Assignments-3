package Assignments3;

import java.util.Scanner;

public class ArmstrongNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		
		int n = sc.nextInt();
		
		int sum = 0;
		
		int armStrong = n;
		
		while(armStrong > 0) {
			int cube = armStrong % 10;
			sum = sum + (cube * cube * cube);
			armStrong = armStrong / 10;
		}
		
		if(sum == n) {
			System.out.println(n+" is a Armstrong Number ");
		}else {
			System.out.println(n+" is not an Armstrong Number");
		}

	}

}
