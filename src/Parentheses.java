import java.util.Scanner;
import java.util.StringTokenizer;

// PROGRAM 4

/*
Algorithm:
1. Start
2. Input a string
3. Convert it to uppercase
4. If the string has brackets within brackets, print invalid string and skip to step 7
5. Convert the string to words
6. Print all the words that are not surrounded by brackets
7. End
 */
public class Parentheses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = sc.nextLine().toUpperCase();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				count++;
				if (count > 1) {
					System.out.println("Sorry, an invalid string");
					return;
				}
			} else if (s.charAt(i) == ')') {
				count--;
			}
		}
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			if (token.charAt(0) != '(' && token.charAt(token.length() - 1) != ')') {
				System.out.print(token + " ");
			}
		}
		System.out.println();
	}
}
