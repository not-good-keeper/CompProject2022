import java.util.Scanner;
import java.util.StringTokenizer;

// PROGRAM 11
public class StringManipulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of lines: ");
		int lines = sc.nextInt();
		if (lines > 20) {
			System.out.println("Number of lines should be less than 20");
			System.exit(0);
		}
		System.out.println("Enter the string");
		String str = sc.nextLine();
		for (int i = 0; i < lines; i++) {
			str += sc.nextLine() + " ";
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isAlphabetic(ch) && ch != '\'' && ch != ' ' && ch != '.' && ch != ',' && ch != ';' && ch != ':' && ch != '\n') {
				System.out.println("Invalid string");
				return;
			}
		}
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isAlphabetic(ch) || ch == '\'' || ch == ' ') {
				newStr += ch;
			}
		}
		StringTokenizer st = new StringTokenizer(newStr);
		printReverse(st);
	}

	public static void printReverse(StringTokenizer tokenizer) { // Head Recursion
		if (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			printReverse(tokenizer);
			System.out.print(token + " ");
		}
	}
}
