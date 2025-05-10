package Assignments3;

import java.util.Scanner;

public class MultiplicationOfTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		
		int n = sc.nextInt();
		
		System.out.println("Multiplication Table of given number:");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(n+" * "+i+" = "+(n * i));
		}

	}

}
