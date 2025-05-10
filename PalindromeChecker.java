package Assignments3;

public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 767;
		int rev = 0;
		
		int originalNumber = n;
		
		while(n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		
		if(originalNumber == rev) {
			System.out.println("It is a Palindrome Number");
		}else {
			System.out.println("It is not a Palindrome Number");
		}

	}

}
