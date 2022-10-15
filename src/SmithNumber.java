/*Question 1
A Smith number is a composite number, whose sum of the digits is equal to the sum of its prime factors.
For example:
22, 27, 58, 85, 94, 121…………….....are Smith numbers.
Write a program in Java to enter a number and check whether it is a Smith number or not.

Sample Input: 666
Sum of the digits: 6 + 6 + 6 = 18
Prime factors are: 2, 3, 3, 37
Sum of the digits of the prime factors: 2 + 3 + 3 + (3 + 7) = 18 
Thus, 666 is a Smith Number.
*/



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
