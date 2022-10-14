import java.util.Scanner;

// PROGRAM 5
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
