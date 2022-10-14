import java.util.Scanner;

// PROGRAM 2

/*
Algorithm:
1. Start
2. Input a number
3. Concatenate the number, 2 * number and 3 * number
4. Check if the concatenated number has all digits 1 through 9
5. If yes, then print that number is a fascinating number
6. Else print that number is not a fascinating number
7. End
 */
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
