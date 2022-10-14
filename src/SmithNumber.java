import java.util.Scanner;

// PROGRAM 1

/*
Algorithm:
1. Start
2. Input a number
3. Add all the digits of the number
4. Find all the prime factors of the number
5. Add all the digits of the prime factors
6. If digits sum equals prime factor digits sum, then print that number is a Smith number
7. Else print that number is not a Smith number
8. End
 */
public class SmithNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int digitSum = 0;
		int primeSum = 0;
		int temp = n; // Temporary variable
		while (temp > 0) {
			digitSum += temp % 10;
			temp /= 10;
		}
		int nn = n;
		for (int i = 2; i <= nn; i++) {
			while (nn % i == 0) {
				temp = i;
				while (temp > 0) {
					primeSum += temp % 10;
					temp /= 10;
				}
				nn /= i;
			}
		}
		if (digitSum == primeSum) {
			System.out.println(n + " is a Smith Number");
		} else {
			System.out.println(n + " is not a Smith Number");
		}
	}
}
