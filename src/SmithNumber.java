import java.util.Scanner;

// PROGRAM 1
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
