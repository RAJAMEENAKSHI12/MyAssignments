package week1.homeassignment;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int firstNum=0, secNum=1, sum;
		
		System.out.println("Fibonacci Series of first 11 numbers are: ");
		
		for(int i=1; i<=11; i++) {
			System.out.println(firstNum);
			
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
		}
		
	}

}
