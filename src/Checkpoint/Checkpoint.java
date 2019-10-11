package Checkpoint;
public class Checkpoint {
	public static void main(String[] args) {
		for (int X = 0; X < 500; X++) {
			if (X % 2 > 0) {
				System.out.print(X);
				System.out.print(" ");
			}
		}
		for (int X = 0; X < 8; X++) {
			System.out.print(X);
			if (X % 4 != 0) {
				System.out.print(" Potato, ");
			} else if (X % 4 == 0) {
				System.out.println();
			}
		}
		System.out.print("more");
	}
}