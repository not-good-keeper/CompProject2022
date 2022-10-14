import java.util.Scanner;

// PROGRAM 5

/*
Algorithm:
1. Start
2. Input a string
3. If the string length is less than 3 or more than 100, print invalid and skip to step 8
4. Iterate over each character
5. Add 13 to each alphabet's ascii value
6. If it's ascii value is greater than that of z, subtract 26
7. Print the resulting characters
8. End
 */
public class Rot13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		if (s.length() < 3 || s.length() > 100) {
			System.out.println("Invalid Length");
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				c = (char) (c + 13);
				if (c > 'z') {
					c = (char) (c - 26);
				}
			} else if (c >= 'A' && c <= 'Z') {
				c = (char) (c + 13);
				if (c > 'Z') {
					c = (char) (c - 26);
				}
			}
			System.out.print(c);
		}
	}
}
