import java.util.Scanner;

// PROGRAM 6
public class TeamNames {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of teams: ");
		int n = Integer.parseInt(sc.nextLine());
		if (n <= 2 || n >= 9) {
			System.out.println("Invalid Input");
			return;
		}
		int lenMax = -2147483648;
		String[] teams = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter team " + (i + 1) + ": ");
			teams[i] = sc.nextLine();
			if (teams[i].length() > lenMax) {
				lenMax = teams[i].length();
			}
		}
		for (int i = 0; i < lenMax; i++) {
			for (int j = 0; j < n; j++) {
				if (i < teams[j].length()) {
					System.out.print(teams[j].charAt(i) + "\t");
				} else {
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
	}
}
