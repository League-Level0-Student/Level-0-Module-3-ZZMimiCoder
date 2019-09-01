package FizzBuzz;
public class FizzBuzz {
	public static void main(String[] Args) {
		for (int X = 1; X < 31; X++) {
			if (X % 3 == 0 && X % 5 > 0) {
				System.out.println("Fizz");
			}
			else if (X % 3 > 0 && X % 5 == 0) {
				System.out.println("Buzz");
			}
			else if (X % 3 == 0 && X % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else {
				System.out.println(X);
			}		
		}
	}
}
