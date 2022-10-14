import java.util.Scanner;

// PROGRAM 3

/*
Algorithm:
1. Start
2. Input a number
3. Iterate from the number to 0 and find a number whose predecessor and successor are primes
4. Iterate from the number to infinity and find a number whose predecessor and successor are primes
5. Get the closer number of the two
6. Print the number's predecessor and successor
7. End
 */
public class TwinPrimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int lowMiddle = -2147483648;
		for (int i = n; i >= 2; i--) {
			if (isPrime(i - 1) && isPrime(i + 1)) {
				lowMiddle = i;
				break;
			}
		}
		int highMiddle;
		for (int i = n; true; i++) {
			if (isPrime(i - 1) && isPrime(i + 1)) {
				highMiddle = i;
				break;
			}
		}
		int closest = highMiddle - n > n - lowMiddle ? lowMiddle : highMiddle;
		System.out.println("The closest twin primes are " + (closest - 1) + " and " + (closest + 1));
	}

	public static boolean isPrime(int i) {
		if (i == 1) {
			return false;
		}
		for (int j = 2; j < i / 2; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
}
