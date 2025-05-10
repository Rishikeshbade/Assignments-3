package Assignments3;

public class PalindromeFrom1To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Palindrome Numbers from 1 to 100: ");
		
		for( int i = 1; i <= 100; i++) {
			int n = i;
			int rev = 0;
			int originalNumber = n;
			while(n > 0) {
				int rem = n % 10;
				rev = rev * 10 + rem;
				n = n /  10;
			}
			
			if(originalNumber == rev) {
				System.out.println(originalNumber + " ");
			}
		}
	}

}
