package week1.day2;

public class Calculator {
			
		private int addTwoNumbers(int num1,int num2) {
			
			return num1+num2;
		}
		
		public float mul(float num3,int num4) {
			
			return num3*num4;
					
	}
		public void sub() {
			int a = 8;
			int b = 4;
			System.out.println("Subtracted value of two numbers: " +(a-b));
		}

		public static void main(String[] args) {
			
			Calculator c1 = new Calculator();
			
			System.out.println("Sum of two numbers: "+c1.addTwoNumbers(4, 4));
			System.out.println("Multiplication of two nubers: "+c1.mul(4.4f, 2));
			c1.sub();
		}
}
