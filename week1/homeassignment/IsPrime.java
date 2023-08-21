package week1.homeassignment;

public class IsPrime {
	public static void main(String[] args) {
		
		int n = 22;
		int count=0;
		System.out.println("The given number is "+n);
		
				for(int i=2; i<=n-1; i++) {
				if(n%i==0) {
					
					count++;
				}
								
				}
				if(count>=1) {
					System.out.println("The number is not a prime number.");
				}
				else {
					System.out.println("The number is a prime number.");
					
				}
			}
		}
		
	


