import java.util.Scanner;
import java.util.StringTokenizer;

// PROGRAM 4
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
