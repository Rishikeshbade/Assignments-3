package Assignments3;

import java.util.Scanner;

public class PalindromeCheckOfGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		int rev = 0;
		
		int originalNumber = n;
		
		while(n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		
		if(originalNumber == rev) {
			System.out.println("It is a Palindrome");
		}else {
			System.out.println("It is not a Palindrome");
		}
	}

}
