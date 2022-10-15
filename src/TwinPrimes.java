import java.util.Scanner;

// PROGRAM 3

/*
Question 3
Twins primes are consecutive prime numbers whose difference is 2. For example, (3,5), (11,13), (17,19) are all twin primes. We define the distance of any twin prime pair from a positive integer as follows. If ( p 1,p2) is a twin prime pair and n is a positive integer then the distance of the twin prime from n is: minimum(abs(n-pl), abs(n-p2)) where abs returns the absolute value of its argument, and minimum returns the smaller of its two arguments. Write a program that reads in a positive integer n and prints out the twin prime pair that has the least distance from n.
For example:

(a) if n is 30 then the pair is (29, 31),
(b) if n is 13 it is (11,13), if n is 49 it is(41, 43)
(c) if n is 54 it is (59, 61).
Sample Input: 34
Sample Output:
Number read in is 34              P1 = 59, P2 = 61
Sample Input: 60
Sample Output:
Number read in is 60              P1 = 29, P2= 31

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
