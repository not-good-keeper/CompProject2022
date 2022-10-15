import java.util.Scanner;

// PROGRAM 2

/*
Question 1
A Smith number is a composite number, whose sum of the digits is equal to the sum of its prime factors.
For example:
22, 27, 58, 85, 94, 121…………….....are Smith numbers.
Write a program in Java to enter a number and check whether it is a Smith number or not.

Sample Input: 666
Sum of the digits: 6 + 6 + 6 = 18
Prime factors are: 2, 3, 3, 37
Sum of the digits of the prime factors: 2 + 3 + 3 + (3 + 7) = 18 
Thus, 666 is a Smith Number.


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
