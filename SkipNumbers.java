package Assignments3;

public class SkipNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i;
		for(i = 1; i <= 10; i++) {
			if( i == 5 || i == 6) {
				continue;
			}
			
			System.out.println(i);
		}
	}

}
