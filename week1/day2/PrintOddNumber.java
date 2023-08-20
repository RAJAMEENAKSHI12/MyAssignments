package week1.day2;

public class PrintOddNumber {
	public static void main(String[] args) {
		System.out.println("Odd numbers from 1 to 20 are: ");
		for(int i=1; i<=20; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
		System.out.println("Odd numbers method 2:");
		for (int i = 1; i < 20; i=i+2) {
			System.out.println(i);
		}
	}

}
