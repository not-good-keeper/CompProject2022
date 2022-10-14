import java.util.Scanner;

// PROGRAM 2
public class FascinatingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		long concat = Long.parseLong(n + "" + (n * 2) + (n * 3));
		boolean[] digits = new boolean[9];
		while (concat > 0) {
			int digit = (int) (concat % 10);
			if (digit == 0 || digits[digit - 1]) {
				System.out.println(n + " is not a Fascinating Number");
				return;
			}
			digits[digit - 1] = true;
			concat /= 10;
		}
		System.out.println(n + " is a Fascinating Number");
	}
}
